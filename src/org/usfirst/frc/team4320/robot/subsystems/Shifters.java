package org.usfirst.frc.team4320.robot.subsystems;

import org.usfirst.frc.team4320.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shifters extends Subsystem {

    private DoubleSolenoid leftShifter;
    private DoubleSolenoid rightShifter;
    private static Shifters instance;
    
    public static Shifters getInstance() {
    	if(instance==null)
    	{
    		instance=new Shifters();
    	}
    	return instance;
    }
    
    private Shifters() {
    	
    	leftShifter=new DoubleSolenoid(RobotMap.SHIFTERS_LEFT_FORWARD,RobotMap.SHIFTERS_LEFT_REVERSE);
    	rightShifter=new DoubleSolenoid(RobotMap.SHIFTERS_RIGHT_FORWARD,RobotMap.SHIFTERS_RIGHT_REVERSE);
    }
    
    public void setLeftShifterState(DoubleSolenoid.Value value) //check this
	{ 
    	leftShifter.set(value);
	}
	
	public DoubleSolenoid.Value getLeftShifterState()
	{
		return leftShifter.get();
	}

	public void setRightShifterState(DoubleSolenoid.Value value) //check this
	{ 
		rightShifter.set(value);
	}
	
	public DoubleSolenoid.Value getRightShifterState()
	{
		return rightShifter.get();
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

