package org.usfirst.frc.team4320.robot.commands;

import org.usfirst.frc.team4320.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class GripperOpenCommand extends InstantCommand {

    public GripperOpenCommand() {
        super();
        requires(Robot.gripperOpen);
    }

    // Called once when the command executes
    protected void initialize() {
    	
    	if(Robot.gripperOpen.getRightSolenoidState()==Value.kForward) 
    	{
    		Robot.gripperOpen.setRightSolenoidState(Value.kReverse);
    		Robot.gripperOpen.setLeftSolenoidState(Value.kReverse);
    	}
    	else
    	{
    		Robot.gripperOpen.setRightSolenoidState(Value.kForward);
    		Robot.gripperOpen.setLeftSolenoidState(Value.kForward);
    	}
    }

}
