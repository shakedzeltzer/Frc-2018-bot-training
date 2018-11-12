package org.usfirst.frc.team4320.robot.subsystems;

import org.usfirst.frc.team4320.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GripperOpen extends Subsystem {

    private DoubleSolenoid leftSide;
    private DoubleSolenoid rightSide;
    private static GripperOpen instance;
    
    public static GripperOpen getInstance() {
    	
    	if(instance==null)
    	{
    		instance= new GripperOpen();
    	}
    	return instance;
    }
    
    private GripperOpen() {
    	
    	leftSide=new DoubleSolenoid(RobotMap.GRIPPER_OPEN_LEFT_FORWARD,RobotMap.GRIPPER_OPEN_LEFT_REVERSE);
    	rightSide=new DoubleSolenoid(RobotMap.GRIPPER_OPEN_RIGHT_FORWARD,RobotMap.GRIPPER_OPEN_RIGHT_REVERSE);
    }
    
    public void setLeftSolenoidState(DoubleSolenoid.Value value) //check this
	{ 
    	leftSide.set(value);
	}
	
	public DoubleSolenoid.Value getLeftSolenoidState()
	{
		return leftSide.get();
	}

	public void setRightSolenoidState(DoubleSolenoid.Value value) //check this
	{ 
		rightSide.set(value);
	}
	
	public DoubleSolenoid.Value getRightSolenoidState()
	{
		return rightSide.get();
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

