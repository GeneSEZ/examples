package de.genesez.example.java.BankTutorial.Server.businessLogic;

/*PROTECTED REGION ID(java.type.import._16_0_129203bc_1271098518953_628755_306) ENABLED START*/
/* TODO: put your own source code here */
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import de.genesez.example.java.BankTutorial.Server.data.AbstractAccount;
import de.genesez.example.java.BankTutorial.Server.data.Bank;
import de.genesez.example.java.BankTutorial.Server.data.Customer;

/*PROTECTED REGION END*/

/**
 * The account bean administrates the account entities
 * @author	apflueger
 */

@Stateless(name = "AccountBean")
public class AccountBean implements IAccountBeanLocal {
	
	// -- generated attribute, constant + association declarations ----------
	
	@EJB
	private IInterestBeanLocal fb;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	// -- generated constructors --------------------------------------------
	/**
	 * constructor for class '<em><b>AccountBean</b></em>'
	 */
	public AccountBean() {
	}
	
	// -- generated method stubs for implementations + derived attributes ---
	/**
	 * This method opens an account for a customer of a bank and returns the persisted account.
	 * It has to check if the customer is really a customer of the bank. If the check fails the method returns null
	 * @param	account	
	 * @param	customer	
	 * @param	bank	
	 * @return	This method opens an account for a customer of a bank and returns the persisted account.It has to check if the customer is really a customer of the bank. If the check fails the method returns null
	 */
	
	public AbstractAccount openAccount(AbstractAccount account, Customer customer, Bank bank) {
		/* PROTECTED REGION ID(java.implementation._16_0_129203bc_1271098526140_221299_328) ENABLED START */
		// TODO: implementation of method 'AccountBean.openAccount(...)'
		throw new UnsupportedOperationException("The implementation of this generated method stub is missing!");
		/* PROTECTED REGION END */
	}
	
	/**
	 * This method removes an account from the database
	 * @param	toBeDeleted	
	 */
	
	public void removeAccount(AbstractAccount toBeDeleted) {
		/* PROTECTED REGION ID(java.implementation._16_0_129203bc_1271098548578_11924_332) ENABLED START */
		// TODO: implementation of method 'AccountBean.removeAccount(...)'
		throw new UnsupportedOperationException("The implementation of this generated method stub is missing!");
		/* PROTECTED REGION END */
	}
	
	// -- generated association + attribute accessors -----------------------
	
	// -- generated code of other cartridges --------------------------------
	
	// -- own code implementation -------------------------------------------
	/* PROTECTED REGION ID(java.class.own.code.implementation._16_0_129203bc_1271098518953_628755_306) ENABLED START */
	// TODO: put your own implementation code here
	/* PROTECTED REGION END */

}
