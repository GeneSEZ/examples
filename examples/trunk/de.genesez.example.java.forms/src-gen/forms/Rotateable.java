package forms;

/* 
 *	Do not place import/include statements above this comment, just below. 
 * 	@FILE-ID : (_14_0_b6f02e1_1214478880187_510458_215) 
 */

import traceability.ScenarioStep;
import static traceability.Requirement.Value.R6;
import de.genesez.platforms.java.umlsupport.associations.*;
import traceability.Requirement;
import traceability.Scenario;

/**
 * describes things which can be <i><b>rotated</b></i>
 * @author domwet
 */
@Requirement({
	R6
})
public interface Rotateable {
	
	/**
	 * performs a rotation by the specified angle
	 * @param	phi	the angle in degrees
	 */
	public void rotate(double phi);
	
	/**
	 * performs a rotations around the specified point by the specified angle
	 * @param	center	the center of the rotation
	 * @param	phi	the angle in degrees
	 */
	public void rotate(Point center, double phi);
	
	// -- generated code of other cartridges --------------------------------
	
	// -- own code implementation -------------------------------------------
	/* PROTECTED REGION ID(java.interface.own.code.declaration._14_0_b6f02e1_1214478880187_510458_215) ENABLED START */
	// TODO: put your own implementation code here
	/* PROTECTED REGION END */
}
