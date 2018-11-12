package org.usfirst.frc.team4320.robot.commands;

import org.usfirst.frc.team4320.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ElevatorCommand extends Command {

    public ElevatorCommand() {
        requires(Robot.elevator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.elevator.activeElevator(Robot.m_oi.getTrigerY());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	
    	if( Robot.m_oi.getTrigerY()>0 && Robot.elevator.getUpElevatorSwitch()) //the elevator goes upand the up switch is pressed
    	{
    		return true;
    	}
    	else if(Robot.m_oi.getTrigerY()<0 && Robot.elevator.getDownElevatorSwitch()) { //the elevator goes down and the down switch is pressed
    		return true;
    	}
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.elevator.activeElevator(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
