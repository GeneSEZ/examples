package forms;

/* 
 *	Do not place import/include statements above this comment, just below. 
 * 	@FILE-ID : (_16_0_b6f02e1_1249463754375_944273_708) 
 */
import game.Scene;

/* 
 *	Do not place import/include statements above this comment, just below. 
 * 	@FILE-ID : (_16_0_b6f02e1_1249463754375_944273_708) 
 */
import java.awt.Color;

import sun.awt.windows.ThemeReader;

/**
 * Describes the geometrical form <b>polygon</b>
 */
public class Polygon extends AbstractForm implements Form {
	
	/**
	 * the points a polygon consists of
	 */
	private Point[] points = null;
	
	/**
	 * constructs a polygon with the specified points
	 * @param	points	points describing a polygon in the given order
	 */
	public Polygon(Point[] points) {
		/* PROTECTED REGION ID(java.constructor._16_0_b6f02e1_1249463814500_484130_734) ENABLED START */
		this.points = new Point[points.length];
		for (int i = 0; i < points.length; i++) {
			this.points[i] = points[i];
		}
		/* PROTECTED REGION END */
	}
	
	/**
	 * moves the position by the given delta values within a 2-dimensional 
	 * coordinate system
	 * @param	dx	delta value to move in <i><b>x</b></i> direction
	 * @param	dy	delta value to move in <i><b>y</b></i> direction
	 */
	public void move(double dx, double dy) {
		/* PROTECTED REGION ID(java.implementation._16_0_b6f02e1_1249463754375_944273_708__14_0_b6f02e1_1214478865734_965960_209) ENABLED START */
		for (Point p : points) {
			p.move(dx, dy);
		}
		/* PROTECTED REGION END */
	}
	
	/**
	 * performs a rotation by the specified angle
	 * @param	phi	the angle in degrees
	 */
	public void rotate(double phi) {
		/* PROTECTED REGION ID(java.implementation._16_0_b6f02e1_1249463754375_944273_708__14_0_b6f02e1_1212580097609_734698_127) ENABLED START */
		for (Point p : points) {
			p.rotate(phi);
		}
		/* PROTECTED REGION END */
	}
	
	/**
	 * performs a rotations around the specified point by the specified angle
	 * @param	center	the center of the rotation
	 * @param	phi	the angle in degrees
	 */
	public void rotate(Point center, double phi) {
		/* PROTECTED REGION ID(java.implementation._16_0_b6f02e1_1249463754375_944273_708__14_0_b6f02e1_1214478889937_90346_236) ENABLED START */
		for (Point p : points) {
			p.rotate(center, phi);
		}
		/* PROTECTED REGION END */
	}
	
	/**
	 * changes the color by repainting using the specified color
	 * @param	color	the color to use for repainting
	 */
	public void repaint(Color color, boolean solid) {
		/* PROTECTED REGION ID(java.implementation._16_0_b6f02e1_1249463754375_944273_708__16_0_b6f02e1_1249464738828_388422_1023) ENABLED START */
		if (theShape != null) {
			Scene.getBoard().removeShape(theShape);
		}
		double[] x = new double[points.length];
		double[] y = new double[points.length];
		Point tmpPoint = null;
		for (int i = 0; i < points.length; i++) {
			tmpPoint = points[i];
			x[i] = tmpPoint.getX();
			y[i] = tmpPoint.getY();
		}
		theShape = Scene.getBoard().drawPolygon(x, y);
		/* PROTECTED REGION END */
	}
	
	/**
	 * determines the center of area of the form
	 * @return	the location of the center of area
	 */
	public Point getCenterOfArea() {
		/* PROTECTED REGION ID(java.implementation._16_0_b6f02e1_1249463754375_944273_708__16_0_b6f02e1_1249464477484_822826_834) ENABLED START */
		double minX, maxX;
		double minY, maxY;
		// the case, that the Array of Points has size 1 is ignored here because it makes no sense
		minX = maxX = points[0].getX(); //initial value of the first point in the list
		minY = maxY = points[0].getY();
		Point tmpPoint = null;
		double tmpX;
		double tmpY;
		for (int i = 1; i < points.length; i++) {
			tmpPoint = points[i];
			tmpX = tmpPoint.getX();
			tmpY = tmpPoint.getY();
			if (tmpX > maxX) {
				maxX = tmpX;
			} else if (tmpX < minX) {
				minX = tmpX;
			} else if (tmpY > maxY) {
				maxY = tmpY;
			} else if (tmpY < minY) {
				minY = tmpY;
			}
		}
		return new Point((minX + maxX) / 2, (minY + maxY) / 2);
		/* PROTECTED REGION END */
	}
	
	/**
	 * determines if the form is crossing another form
	 * @param	form	the form to check for crossing
	 * @return	true, if the specified form crosses this form, otherwise false
	 */
	public boolean isCrossing(Form form) {
		/* PROTECTED REGION ID(java.implementation._16_0_b6f02e1_1249463754375_944273_708__16_0_b6f02e1_1249464485156_784670_838) ENABLED START */
		// TODO: implementation of method 'Polygon.isCrossing(...)'
		throw new UnsupportedOperationException("The implementation of this generated method stub is missing!");
		/* PROTECTED REGION END */
	}
	
	/* PROTECTED REGION ID(java.class.own.code.implementation._16_0_b6f02e1_1249463754375_944273_708) ENABLED START */
	// TODO: put your own implementation code here
	/* PROTECTED REGION END */
}
