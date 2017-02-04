package org.usfirst.frc.team20.robot;

import com.ctre.CANTalon;

public class CANTalonCurrent {
	public static CANTalon fr = new CANTalon(8);
	public static CANTalon br = new CANTalon(9);
	public static CANTalon fl = new CANTalon(10);
	public static CANTalon bl = new CANTalon(12);
	
	public double CANTalon8(){
		return fr.getOutputCurrent();
	}
	public double CANTalon9(){
		return br.getOutputCurrent();
	}
	public double CANTalon10(){
		return fl.getOutputCurrent();
	}
	public double CANTalon12(){
		return bl.getOutputCurrent();
	}
	

}


