import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// FIX: Changed "implements keyHandler" to "implements KeyListener"
public class KeyHandler implements KeyListener {

    public boolean upPressed, downPressed, leftPressed, rightPressed;

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used for game movement, but required by the interface
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Code for when a key is pressed down goes here
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_W){
            upPressed = true;
        }

        if (code == KeyEvent.VK_S){
            downPressed = true;
        }

        if (code == KeyEvent.VK_A){
            leftPressed = true;
        }

        if (code == KeyEvent.VK_D){
            rightPressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Code for when a key is released goes here
        int code = e.getKeyCode();
         if (code == KeyEvent.VK_W){
            upPressed = false;
        }

        if (code == KeyEvent.VK_S){
            downPressed = false;
        }

        if (code == KeyEvent.VK_A){
            leftPressed = false;
        }

        if (code == KeyEvent.VK_D){
            rightPressed = false;
        }
    }
}
