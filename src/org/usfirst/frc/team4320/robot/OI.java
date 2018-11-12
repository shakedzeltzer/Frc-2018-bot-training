/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4320.robot;

import org.usfirst.frc.team4320.robot.commands.GripperPickCommand;
import org.usfirst.frc.team4320.robot.commands.GripperReleaseCommand;
import org.usfirst.frc.team4320.robot.commands.ShiftersCommand;
import org.usfirst.frc.team4320.robot.commands.GripperLiftCommand;
import org.usfirst.frc.team4320.robot.commands.GripperOpenCommand;
import org.usfirst.frc.team4320.robot.commands.GripperOverrideCommand;
import org.usfirst.frc.team4320.robot.commands.GripperPickCommand;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	private Joystick leftStick;
	private Joystick rightStick;
	private XboxController xbox;
	private JoystickButton gripperPickButton;
	private JoystickButton gripperOverrideButton;
	private JoystickButton gripperReleaseButton;
	private JoystickButton gripperLiftButton;
	private JoystickButton gripperOpenButton;
	private JoystickButton shiftersButton;
	
	public OI() {
		leftStick=new Joystick(RobotMap.LEFT_JOYSTICK_PORT);
		rightStick=new Joystick(RobotMap.RIGHT_JOYSTICK_PORT);
		
		xbox=new XboxController(RobotMap.XBOX_PORT);
		gripperPickButton=new JoystickButton(xbox,1);
		gripperOverrideButton=new JoystickButton(xbox,2);
		gripperReleaseButton=new JoystickButton(xbox,3);
		gripperLiftButton=new JoystickButton(xbox,4);
		gripperOpenButton=new JoystickButton(xbox,5);
		shiftersButton=new JoystickButton(xbox,6);
		
		gripperPickButton.whileHeld(new GripperPickCommand());
		gripperOverrideButton.whileHeld(new GripperOverrideCommand());
		gripperReleaseButton.whileHeld(new GripperReleaseCommand());
		gripperLiftButton.whenPressed(new GripperLiftCommand());
		gripperOpenButton.whenPressed(new GripperOpenCommand());
		shiftersButton.whenPressed(new ShiftersCommand());
		
	}
	
	public double getTrigerY() {
		return xbox.getY(Hand.kRight);
	}
	
	public double getLeftY() {
		return leftStick.getY();
	}
	
	public double getRightY() {
		return rightStick.getY();
	}
	
	
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
