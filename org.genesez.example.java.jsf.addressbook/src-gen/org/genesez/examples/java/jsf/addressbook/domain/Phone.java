package org.genesez.examples.java.jsf.addressbook.domain;

/* 
 *	Do not place import/include statements above this comment, just below. 
 * 	@FILE-ID : (_17_0_1_b3f027f_1346926165343_45655_2214) 
 */

import javax.persistence.Entity;

/**
 * Please describe the responsibility of your class in your modeling tool.
 * @author roman01
 */
@Entity
public class Phone extends Contact {
	
	private String extension;
	
	private String number;
	
	/**
	 * Returns the value of attribute '<em><b>extension</b></em>'
	 */
	public String getExtension() {
		return extension;
	}
	
	/**
	 * Sets the value of attribute '<em><b>extension</b></em>'
	 */
	public void setExtension(String extension) {
		this.extension = extension;
	}
	
	/**
	 * Returns the value of attribute '<em><b>number</b></em>'
	 */
	public String getNumber() {
		return number;
	}
	
	/**
	 * Sets the value of attribute '<em><b>number</b></em>'
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	
	// -- generated code of other cartridges --------------------------------
	
	// -- own code implementation -------------------------------------------
	/* PROTECTED REGION ID(java.class.own.code.implementation._17_0_1_b3f027f_1346926165343_45655_2214) ENABLED START */
	// TODO: put your own implementation code here
	/* PROTECTED REGION END */
	
}
