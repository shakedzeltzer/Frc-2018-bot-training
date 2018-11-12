package org.usfirst.frc.team4320.robot.subsystems;

import org.usfirst.frc.team4320.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Gripper extends Subsystem {
	
	private Spark gripperLeftSpark;
	private Spark gripperRightSpark;
	private DigitalInput gripperSwitch;
	private static Gripper instance;
	
	public static Gripper getInstance() {
		if(instance==null) {
			instance=new Gripper();
		}
		return instance;
	}
	
	private Gripper() {
		gripperLeftSpark=new Spark(RobotMap.GRIPPER_LEFT_SPARK);
		gripperRightSpark=new Spark(RobotMap.GRIPPER_RIGHT_SPARK);
		gripperSwitch=new DigitalInput(RobotMap.GRIPPER_SWITCH);
	}
	
	public void setSparks(double speed) {
		gripperLeftSpark.set(speed);    //turn in opposite directions
		gripperLeftSpark.set(-speed);
	}
	
	public boolean getSwitchValue() {
		return gripperSwitch.get();
	}
	
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

