package org.lejos.learn.helloworld;

import lejos.hardware.lcd.LCD;
import lejos.hardware.port.SensorPort;
import lejos.hardware.Button;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.SensorMode;

public class ColorExample {
	
	private static EV3ColorSensor sensor;
    private static SensorMode brightnessSensorMode;

    public static void main(String[] args) {
        sensor = new EV3ColorSensor(SensorPort.S1);
        sensor.setFloodlight(false);
        LCD.drawString("Init", 2, 2);
        LCD.setAutoRefresh(false);
        brightnessSensorMode = sensor.getRGBMode();
        float[] sample = new float[brightnessSensorMode.sampleSize()];
        
        boolean buttonPressed = false;

        while(!buttonPressed) {
            brightnessSensorMode.fetchSample(sample, 0);
            LCD.refresh();
            LCD.clear();
            System.out.println("R: " + sample[0] + " G: " + sample[1] + " B: " + sample[2]);
            LCD.drawString("R: " + sample[0], 1, 1);
            LCD.drawString("G: " + sample[1], 1, 2);
            LCD.drawString("B: " + sample[2], 1, 3);
            
            if (Button.readButtons() != 0) {
            	buttonPressed = true;
            }
        }

    }

}
