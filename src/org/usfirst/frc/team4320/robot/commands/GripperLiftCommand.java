package org.usfirst.frc.team4320.robot.commands;

import org.usfirst.frc.team4320.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class GripperLiftCommand extends InstantCommand {

    public GripperLiftCommand() {
        super();
        requires(Robot.gripperLift);
    }

    protected void initialize() {
    	
    	if(Robot.gripperLift.getSolenoidState()==Value.kForward) 
    	{
    		Robot.gripperLift.setSolenoidState(Value.kReverse);
    	}
    	else
    	{
    		Robot.gripperLift.setSolenoidState(Value.kForward); 
    	}
    }
}
