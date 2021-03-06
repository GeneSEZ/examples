package org.genesez.example.java.BankTutorial.Server.businessLogic;

/* 
 *	Do not place import/include statements above this comment, just below. 
 * 	@FILE-ID : (_16_0_129203bc_1271098518953_628755_306) 
 */
import org.genesez.example.java.BankTutorial.Server.data.Account;
import org.genesez.example.java.BankTutorial.Server.data.Bank;
import org.genesez.example.java.BankTutorial.Server.data.Customer;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * The account bean administrates the account entities
 */

@Stateless(name = "AccountBean")
public class AccountBean implements IAccountBeanLocal {
	
	@EJB
	private IInterestBeanLocal fb;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	/**
	 * Constructor for class '<em><b>AccountBean</b></em>'.
	 */
	
	public AccountBean() {
	}
	
	/**
	 * This method opens an account for a customer of a bank and returns the persisted account.
	 * It has to check if the customer is really a customer of the bank. If the check fails the method returns null
	 */
	
	public Account openAccount(Account account, Customer customer, Bank bank) {
		/* PROTECTED REGION ID(java.implementation._16_0_129203bc_1271098526140_221299_328) ENABLED START */
		// TODO: implementation of method 'AccountBean.openAccount(...)'
		throw new UnsupportedOperationException("The implementation of this generated method stub is missing!");
		/* PROTECTED REGION END */
	}
	
	/**
	 * This method removes an account from the database
	 */
	
	public void removeAccount(Account toBeDeleted) {
		/* PROTECTED REGION ID(java.implementation._16_0_129203bc_1271098548578_11924_332) ENABLED START */
		// TODO: implementation of method 'AccountBean.removeAccount(...)'
		throw new UnsupportedOperationException("The implementation of this generated method stub is missing!");
		/* PROTECTED REGION END */
	}
	
	/* PROTECTED REGION ID(java.class.own.code.implementation._16_0_129203bc_1271098518953_628755_306) ENABLED START */
	// TODO: put your own implementation code here
	/* PROTECTED REGION END */
}
