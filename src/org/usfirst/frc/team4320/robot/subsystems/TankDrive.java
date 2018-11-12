package org.usfirst.frc.team4320.robot.subsystems;

import org.usfirst.frc.team4320.robot.RobotMap;
import org.usfirst.frc.team4320.robot.commands.TankDriveCommand;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class TankDrive extends Subsystem {

    private WPI_TalonSRX leftBackTalon;
    private WPI_TalonSRX leftFrontTalon;
    private WPI_TalonSRX rightBackTalon;
    private WPI_TalonSRX rightFrontTalon;
    private DifferentialDrive drive;
    private static TankDrive instance;
    
    public static TankDrive getInstance(){
    	
    	if(instance==null)
    	{
    		instance=new TankDrive();
    	}
    	return instance;
    }
    
    private TankDrive() {
    	
    	leftBackTalon=new WPI_TalonSRX(RobotMap.LEFT_BACK_TALON);
    	leftFrontTalon=new WPI_TalonSRX(RobotMap.LEFT_FRONT_TALON);
    	rightBackTalon=new WPI_TalonSRX(RobotMap.RIGHT_BACK_TALON);
    	rightFrontTalon=new WPI_TalonSRX(RobotMap.RIGHT_FRONT_TALON);
    	
    	leftFrontTalon.set(ControlMode.Follower, RobotMap.LEFT_BACK_TALON);
    	rightFrontTalon.set(ControlMode.Follower, RobotMap.RIGHT_FRONT_TALON);
    	
    	drive=new DifferentialDrive(leftFrontTalon,rightFrontTalon);
    	
    }
    
    public void driveRobot(double leftSpeed, double rightSpeed) {
    	
    	drive.tankDrive(leftSpeed, rightSpeed);
    }
    
    public double getLeftEncoderTurns()
	{
		return (leftFrontTalon.getSelectedSensorPosition(0)/256.0);
	}
	public double getRightEncoderTurns()
	{
		return (rightFrontTalon.getSelectedSensorPosition(0)/256.0);
	}
	
	public void updateEncoderStatus()
	{
		SmartDashboard.putNumber("Left Wheel Turns", getLeftEncoderTurns());
		SmartDashboard.putNumber("Right Wheel Turns", getRightEncoderTurns());
	}

    public void initDefaultCommand() {
    	setDefaultCommand(new TankDriveCommand());
    }
}

