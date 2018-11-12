package org.usfirst.frc.team4320.robot.subsystems;

import org.usfirst.frc.team4320.robot.Robot;
import org.usfirst.frc.team4320.robot.RobotMap;
import org.usfirst.frc.team4320.robot.commands.PneumaticCompressorCommand;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class PneumaticCompressor extends Subsystem {

	private Compressor compressor;
	private AnalogInput sensor;
	private static PneumaticCompressor instance;
	
	public static PneumaticCompressor getInstance()
	{
		if(instance==null)
		{
			return new PneumaticCompressor();
		}
		return instance;
	}
	
	private PneumaticCompressor()
	{
		compressor=new Compressor();
		sensor=new AnalogInput(RobotMap.PRESSURE_SENSOR);
	}
	
	public void setCompressorState(boolean state)
	{
		compressor.setClosedLoopControl(state);
	}
	
	public double getPressure() {
		return 250*(sensor.getValue()/5)-25;
	}
	
	public void updatePressureStatus() {
		SmartDashboard.putNumber("compressor pressure: ", getPressure());
	}

    public void initDefaultCommand() {
        setDefaultCommand(new PneumaticCompressorCommand());
    }
}

