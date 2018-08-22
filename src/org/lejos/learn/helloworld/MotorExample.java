package org.lejos.learn.helloworld;

import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;

public class MotorExample {
	
    public static void main(String[] args) {
    	RegulatedMotor motorA = new EV3LargeRegulatedMotor(MotorPort.A);
    	    	
        boolean buttonPressed = false;

        while(!buttonPressed) {
        	// Or without using a variable: Motor.A.forward();
        	motorA.forward();
        	
        	if (Button.readButtons() != 0) {
            	buttonPressed = true;
            	
            	motorA.stop();
            }
        }
        
        motorA.close();
    }
}