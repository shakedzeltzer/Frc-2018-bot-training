/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4320.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	//pwm ports
	
	public static final int ELEVATOR_SPARK=0; 
	public static final int GRIPPER_LEFT_SPARK=1;
	public static final int GRIPPER_RIGHT_SPARK=2;
	
	//drive:
	public static final int LEFT_BACK_TALON=3;
	public static final int LEFT_FRONT_TALON=4;
	public static final int RIGHT_BACK_TALON=5;
	public static final int RIGHT_FRONT_TALON=6;
	
	
	
	//joystick ports:
	
	public static final int XBOX_PORT=0;
	public static final int LEFT_JOYSTICK_PORT=1;
	public static final int RIGHT_JOYSTICK_PORT=2;

	
	//digital input ports
	
	public static final int UP_ELEVATOR_SWITCH=0;
	public static final int DOWN_ELEVATOR_SWITCH=1;
	public static final int GRIPPER_SWITCH=2;
	
	//pneumatic ports
	
	public static final int GRIPPER_LIFT_FORWARD=0;
	public static final int GRIPPER_LIFT_REVERSE=1;
	public static final int GRIPPER_OPEN_LEFT_FORWARD=2;
	public static final int GRIPPER_OPEN_LEFT_REVERSE=3;
	public static final int GRIPPER_OPEN_RIGHT_FORWARD=4;
	public static final int GRIPPER_OPEN_RIGHT_REVERSE=5;
	public static final int SHIFTERS_LEFT_FORWARD=6;
	public static final int SHIFTERS_LEFT_REVERSE=7;
	public static final int SHIFTERS_RIGHT_FORWARD=8;
	public static final int SHIFTERS_RIGHT_REVERSE=9;
	
	//analog input ports:
	
	public static final int PRESSURE_SENSOR=0;
	
	

	
	
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
