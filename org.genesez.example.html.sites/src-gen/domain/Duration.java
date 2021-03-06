package domain;

/* 
 *	Do not place import/include statements above this comment, just below. 
 * 	@FILE-ID : (_17_0_1_8a7027a_1346831146059_466149_1652) 
 */

import java.util.LinkedHashMap;
import java.util.Map;
import org.genesez.platform.java.umlsupport.associations.*;

/**
 * Represents the <b><i>amount</i></b> of time spent for something. This 
 * amount is defined as the <u><i>time difference</i></u> of the start to the 
 * end.
 * @author nicher
 */
public class Duration {
	
	// -- generated attribute, constant + association declarations ----------
	private double time;
	
	private String unit;
	
	// -- generated constructors --------------------------------------------
	
	/**
	 * Initializing constructor for class '<em><b>Duration</b></em>'.
	 * @param	time	{@link double.getTime()}
	 * @param	unit	{@link String.getUnit()}
	 */
	public Duration(double time, String unit) {
		this.time = time;
		this.unit = unit;
	}
	
	// -- generated association + attribute accessors -----------------------
	/**
	 * Returns the value of attribute '<em><b>time</b></em>'
	 */
	public double getTime() {
		return time;
	}
	
	/**
	 * Returns the value of attribute '<em><b>unit</b></em>'
	 */
	public String getUnit() {
		return unit;
	}
	
	// -- own code implementation -------------------------------------------
	/* PROTECTED REGION ID(java.datatype.own.code.implementation._17_0_1_8a7027a_1346831146059_466149_1652) ENABLED START */
	// TODO: put your own implementation code here
	/* PROTECTED REGION END */
}
