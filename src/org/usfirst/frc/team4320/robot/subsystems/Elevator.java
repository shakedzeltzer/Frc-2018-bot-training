package org.usfirst.frc.team4320.robot.subsystems;

import org.usfirst.frc.team4320.robot.RobotMap;
import org.usfirst.frc.team4320.robot.commands.ElevatorCommand;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Elevator extends Subsystem {

    private Spark elevatorSpark;
    private DigitalInput upElevatorSwitch;
    private DigitalInput downElevatorSwitch;
    private ADXRS450_Gyro gyro;
    private static Elevator instance;
    
    public static Elevator getInstance() {
    	if(instance==null) 
    		instance=new Elevator();
    	return instance;
    }
    
    private Elevator() {
    	elevatorSpark=new Spark(RobotMap.ELEVATOR_SPARK);
    	upElevatorSwitch=new DigitalInput(RobotMap.UP_ELEVATOR_SWITCH);
    	downElevatorSwitch=new DigitalInput(RobotMap.DOWN_ELEVATOR_SWITCH);
    	gyro= new ADXRS450_Gyro();
    }
    
    public void activeElevator(double speed) {
    	elevatorSpark.set(speed);
    }
    
    public boolean getUpElevatorSwitch() {
    	return upElevatorSwitch.isAnalogTrigger();
    }
    public boolean getDownElevatorSwitch() {
    	return downElevatorSwitch.isAnalogTrigger();
    }
    
    public double getAngle() {
    	return gyro.getAngle();
    }
    
    public void updateAngle() {
    	SmartDashboard.putNumber("Angle: ", getAngle());
    }

    public void initDefaultCommand() {
    	setDefaultCommand(new ElevatorCommand());
    }
}

