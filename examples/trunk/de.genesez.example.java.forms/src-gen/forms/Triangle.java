package forms;

/* 
 *	Do not place import/include statements above this comment, just below. 
 * 	@FILE-ID : (_16_0_b6f02e1_1249464030468_592473_783) 
 */

import traceability.ScenarioStep;
import static traceability.Requirement.Value.R1;
import de.genesez.platforms.java.umlsupport.associations.*;
import traceability.Requirement;
import traceability.Scenario;

/**
 * Describes the geometrical form <b>triangle</b> as a special <i>polygon</i>
 * @author domwet
 */
@Requirement({
	R1
})
public class Triangle extends Polygon {
	
	// -- generated constructors --------------------------------------------
	/**
	 * constructs a triangle with the points in the specified order
	 * @param	a	the first point of the triangle
	 * @param	b	the second point of the triangle
	 * @param	c	the third point of the triangle
	 */
	public Triangle(Point a, Point b, Point c) {
		/* PROTECTED REGION ID(java.constructor._16_0_b6f02e1_1249464090812_470196_811) ENABLED START */
		super(new Point[] {
		a, b, c
		});
		/* PROTECTED REGION END */
	}
	
	// -- generated method stubs for implementations + derived attributes ---
	
	// -- generated code of other cartridges --------------------------------
	
	// -- own code implementation -------------------------------------------
	/* PROTECTED REGION ID(java.class.own.code.implementation._16_0_b6f02e1_1249464030468_592473_783) ENABLED START */
	// TODO: put your own implementation code here
	/* PROTECTED REGION END */
	
}
