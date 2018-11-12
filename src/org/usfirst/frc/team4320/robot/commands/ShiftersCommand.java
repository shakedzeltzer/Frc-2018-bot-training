package org.usfirst.frc.team4320.robot.commands;

import org.usfirst.frc.team4320.robot.Robot;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class ShiftersCommand extends InstantCommand {

    public ShiftersCommand() {
        super();
        requires(Robot.shifters);
    }

    // Called once when the command executes
    protected void initialize() {
    	
    	if(Robot.shifters.getRightShifterState()==Value.kForward) 
    	{
    		Robot.shifters.setRightShifterState(Value.kReverse);
    		Robot.shifters.setLeftShifterState(Value.kReverse);
    	}
    	else
    	{
    		Robot.shifters.setRightShifterState(Value.kForward);
    		Robot.shifters.setLeftShifterState(Value.kForward);
    	}
    	
    }
}
