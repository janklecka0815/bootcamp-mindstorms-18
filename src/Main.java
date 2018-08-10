import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        while (!Button.ENTER.isDown()) {
            // Code hier rein: Kann mit Press auf Button abgebrochen werden
            LCD.drawString("Hallo Welt!", 0, 5);
        }

        LCD.clear();
        System.exit(0);
    }
}