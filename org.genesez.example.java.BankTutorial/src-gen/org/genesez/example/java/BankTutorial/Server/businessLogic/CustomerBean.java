package org.genesez.example.java.BankTutorial.Server.businessLogic;

/* 
 *	Do not place import/include statements above this comment, just below. 
 * 	@FILE-ID : (_16_0_129203bc_1271072817703_182530_863) 
 */
import org.genesez.example.java.BankTutorial.Server.data.Bank;
import org.genesez.example.java.BankTutorial.Server.data.Customer;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ejb.Stateless;

/**
 * The customer bean administrates the customer entities
 */

@Stateless(name = "CustomerBean")
public class CustomerBean implements ICustomerBeanLocal {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	/**
	 * Constructor for class '<em><b>CustomerBean</b></em>'.
	 */
	
	public CustomerBean() {
	}
	
	/**
	 * adds a customer to a bank and returns the persisted customer
	 * If a problem occurs with the customer and/or bank instance, the bank already knows this customer or a database problem occurs the method returns null
	 */
	
	public Customer addCustomer(Bank bank, Customer customer) {
		/* PROTECTED REGION ID(java.implementation._16_0_129203bc_1271072826046_339148_885) ENABLED START */
		// TODO: implementation of method 'CustomerBean.addCustomer(...)'
		throw new UnsupportedOperationException("The implementation of this generated method stub is missing!");
		/* PROTECTED REGION END */
	}
	
	/**
	 * changes the customer of the bank and returns the customer
	 * If a problem occurs with the database the method returns null
	 */
	
	public Customer changeCustomer(Customer changedCustomer) {
		/* PROTECTED REGION ID(java.implementation._16_0_129203bc_1271072861953_123287_890) ENABLED START */
		// TODO: implementation of method 'CustomerBean.changeCustomer(...)'
		throw new UnsupportedOperationException("The implementation of this generated method stub is missing!");
		/* PROTECTED REGION END */
	}
	
	/**
	 * removes the the customer from the database
	 */
	
	public void removeCustomer(Customer toBeDeleted) {
		/* PROTECTED REGION ID(java.implementation._16_0_129203bc_1271072891390_250478_895) ENABLED START */
		// TODO: implementation of method 'CustomerBean.removeCustomer(...)'
		throw new UnsupportedOperationException("The implementation of this generated method stub is missing!");
		/* PROTECTED REGION END */
	}
	
	/* PROTECTED REGION ID(java.class.own.code.implementation._16_0_129203bc_1271072817703_182530_863) ENABLED START */
	// TODO: put your own implementation code here
	/* PROTECTED REGION END */
}
