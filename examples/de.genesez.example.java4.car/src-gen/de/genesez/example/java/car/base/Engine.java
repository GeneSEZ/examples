package de.genesez.example.java.car.base;

import java.util.*;

/* PROTECTED REGION ID(java.type.import._12_5_8a7027a_1182165491328_680838_471) ENABLED START */
// TODO: put your further include + require statements here
/* PROTECTED REGION END */

/**
 * @author	nicher
 */
public class Engine {
	
	// -- generated attribute, constant + association declarations ----------
	
	/**
	 * variable for association to Car
	 */
	private Car car;
	
	/**
	 * @generated	attribute definition
	 */
	private byte ps;
	/**
	 * @generated	attribute definition
	 */
	private String name;
	
	// -- generated association + attribute accessors -----------------------
	/**
	 * @generated	getter for the attribute '<em><b>ps</b></em>'
	 */
	public byte getPs() {
		return ps;
	}
	
	/**
	 * documented here {@link getPs()}
	 * @generated	setter method for the attribute '<em><b>ps</b></em>'
	 */
	public void setPs(byte ps) {
		this.ps = ps;
	}
	
	/**
	 * @generated	getter for the attribute '<em><b>name</b></em>'
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * documented here {@link getName()}
	 * @generated	setter method for the attribute '<em><b>name</b></em>'
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * accessor for association to car
	 */
	public Car getCar() {
		return car;
	}
	
	/**
	 * accessor for association to car
	 */
	public void setCar(Car car) {
		this.car = car;
	}
	
	// -- own code implementation -------------------------------------------
	/* PROTECTED REGION ID(java.class.own.code.implementation._12_5_8a7027a_1182165491328_680838_471) ENABLED START */
	// TODO: put your own implementation code here
	/* PROTECTED REGION END */
}
