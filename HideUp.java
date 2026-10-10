import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HideUp {
    public static void main(String[] args) {
        int result = JOptionPane.showConfirmDialog(null, "Do you want to run?", "Confirmation", JOptionPane.YES_NO_OPTION);
        
        if (result == JOptionPane.YES_OPTION) {
            JFrame window = new JFrame();
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setResizable(false);
            window.setTitle("HideUp");
            
            // 1. Create the panel first
            MainPanel gamePanel = new MainPanel();
            
            // 2. Add the panel to the frame
            window.add(gamePanel);
            
            // 3. Pack the frame around the panel's size (removes the need for setSize)
            window.pack();
            
            // 4. Centre the fully-sized window on the screen
            window.setLocationRelativeTo(null);
            
            // 5. Finally, make the window visible to the player
            window.setVisible(true);
            
            // 6. Start the game loop thread running
            gamePanel.startGameThread();
        }
    }
}
