package org.usfirst.frc.team4320.robot.commands;

import org.usfirst.frc.team4320.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GripperOverrideCommand extends GripperPickCommand {

    public GripperOverrideCommand() {
    	super();
    }
    
    @Override
    protected boolean isFinished() {
        return false;
    }
}
