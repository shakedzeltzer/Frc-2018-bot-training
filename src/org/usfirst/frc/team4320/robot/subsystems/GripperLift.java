package org.usfirst.frc.team4320.robot.subsystems;

import org.usfirst.frc.team4320.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GripperLift extends Subsystem {

    private DoubleSolenoid liftSolenoid;
    private static GripperLift instance;
    
    public static GripperLift getInstance() {
    	if(instance==null) {
    		instance=new GripperLift();
    	}
    	return instance;
    }
    
    private GripperLift() {
    	liftSolenoid=new DoubleSolenoid(RobotMap.GRIPPER_LIFT_FORWARD,RobotMap.GRIPPER_LIFT_REVERSE);
    }
    
    public void setSolenoidState(DoubleSolenoid.Value value) //check this
	{ 
		liftSolenoid.set(value);
	}
	
	public DoubleSolenoid.Value getSolenoidState()
	{
		return liftSolenoid.get();
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

