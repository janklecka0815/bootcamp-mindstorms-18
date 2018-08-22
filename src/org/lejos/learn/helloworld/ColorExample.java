package org.lejos.learn.helloworld;

import lejos.hardware.lcd.LCD;
import lejos.hardware.port.SensorPort;
import lejos.hardware.Button;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.SensorMode;

public class ColorExample {
	
	private static EV3ColorSensor sensor;
    private static SensorMode sensorMode;

    public static void main(String[] args) {
        sensor = new EV3ColorSensor(SensorPort.S1);
        sensor.setFloodlight(false);
        LCD.drawString("-> Started", 2, 2);
        LCD.setAutoRefresh(false);
        sensorMode = sensor.getRGBMode();
        float[] sample = new float[sensorMode.sampleSize()];
        
        boolean buttonPressed = false;

        while(!buttonPressed) {
            sensorMode.fetchSample(sample, 0);
            
            LCD.refresh();
            LCD.clear();
            
            LCD.drawString("R: " + sample[0], 1, 1);
            LCD.drawString("G: " + sample[1], 1, 2);
            LCD.drawString("B: " + sample[2], 1, 3);
            
            if (Button.readButtons() != 0) {
            	buttonPressed = true;
            }
        }

    }

}
