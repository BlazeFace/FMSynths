import java.util.Timer;
import java.util.TimerTask;

/**
 * Updates if the key is pressed
 *
 */
public class PressedKey implements Runnable{
    private boolean isPressed;
    private int keycode;
    private char keys;
    private int key;
    public PressedKey(int key, char keys) {
        isPressed = false;
        this.keys = keys;
        this.keycode = key;
    }
    private void press(){
        if(StdDraw.isKeyPressed(this.keycode)){
            this.isPressed = true;
            System.out.println(this.keys);
        }
    }
    public void run() {
       Timer time = new Timer();
        TimerTask key = new TimerTask() {
            @Override
            public void run() {
                press();
            }
        };
        time.schedule(key, 10, 10);
    }
}