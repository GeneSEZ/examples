package de.genesez.platforms.java.BankTutorial.Server.data;

/*PROTECTED REGION ID(java.type.import._16_0_129203bc_1271071913640_952667_690) ENABLED START*/
/* TODO: put your own source code here */
import java.io.Serializable;

import javax.persistence.Entity;

/*PROTECTED REGION END*/

/**
 * The savings account offers a fixed interest rate of 2.75% for a long period of time. A bank has to deposit the interest rate every 5 minutes.
 * @author	apflueger
 */

@Entity
public class SavingsAccount extends AbstractAccount implements Serializable {
	
	// -- generated constructors --------------------------------------------
	/**
	 * constructor for class '<em><b>SavingsAccount</b></em>'
	 */
	public SavingsAccount() {
		/* PROTECTED REGION ID(java.constructor._16_0_129203bc_1271178598609_999826_315) ENABLED START */
		this.setInterestRate(1.0275f);
		/* PROTECTED REGION END */
	}
	
	// -- generated method stubs for implementations + derived attributes ---
	
	// -- generated code of other cartridges --------------------------------
	
	// -- own code implementation -------------------------------------------
	/* PROTECTED REGION ID(java.class.own.code.implementation._16_0_129203bc_1271071913640_952667_690) ENABLED START */
	// TODO: put your own implementation code here
	/* PROTECTED REGION END */

}
