package de.genesez.platforms.java.BankTutorial.Server.data;

/*PROTECTED REGION ID(java.type.import._16_0_129203bc_1271068723343_566691_1144) ENABLED START*/
/* TODO: put your own source code here */
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Version;

/*PROTECTED REGION END*/

@Entity
@Table(name = "tbl_Bank")
public class Bank implements Serializable {
	
	// -- generated attribute, constant + association declarations ----------
	
	/** stores associated objects of association CONTACT to Contact */
	@ManyToMany(cascade = {
	CascadeType.MERGE, CascadeType.REFRESH
	})
	private java.util.Set<Contact> contact = new java.util.HashSet<Contact>();
	
	/** stores associated objects of association CUSTOMERS to Customer */
	@ManyToMany(cascade = {
		CascadeType.ALL
	}, mappedBy = "banks")
	private java.util.Set<Customer> customers = new java.util.HashSet<Customer>();
	
	@Column(name = "name", unique = true, nullable = false)
	private String name;
	
	@Column(name = "sortCode", unique = true, nullable = false)
	private int sortCode;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Version
	private int version;
	
	// -- generated constructors --------------------------------------------
	/**
	 * constructor for class '<em><b>Bank</b></em>'
	 */
	public Bank() {
	}
	
	// -- generated method stubs for implementations + derived attributes ---
	
	// -- generated association + attribute accessors -----------------------
	/**
	 * getter for the attribute '<em><b>name</b></em>'
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
	 * getter for the attribute '<em><b>sortCode</b></em>'
	 */
	public int getSortCode() {
		return sortCode;
	}
	
	/**
	 * documented here {@link getSortCode()}
	 * @generated	setter method for the attribute '<em><b>sortCode</b></em>'
	 */
	public void setSortCode(int sortCode) {
		this.sortCode = sortCode;
	}
	
	/**
	 * getter for the attribute '<em><b>id</b></em>'
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * documented here {@link getId()}
	 * @generated	setter method for the attribute '<em><b>id</b></em>'
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * getter for the attribute '<em><b>version</b></em>'
	 */
	public int getVersion() {
		return version;
	}
	
	/**
	 * documented here {@link getVersion()}
	 * @generated	setter method for the attribute '<em><b>version</b></em>'
	 */
	public void setVersion(int version) {
		this.version = version;
	}
	
	/**
	 * accessor for association to contact
	 */
	public java.util.Set<Contact> getContact() {
		return this.contact;
		
	}
	
	/**
	 * accessor for association to contact
	 */
	public void insertInContact(Contact contact) {
		if (this.contact.contains(contact)) {
			return;
		}
		this.contact.add(contact);
	}
	
	/**
	 * accessor for association to contact
	 */
	public void removeFromContact(Contact contact) {
		if (!this.contact.contains(contact)) {
			return;
		}
		this.contact.remove(contact);
	}
	
	/**
	 * accessor for association to customers
	 */
	public java.util.Set<Customer> getCustomers() {
		return this.customers;
		
	}
	
	/**
	 * accessor for association to customers
	 */
	public void insertInCustomers(Customer customers) {
		if (this.customers.contains(customers)) {
			return;
		}
		this.customers.add(customers);
		if (!customers.getBanks().contains(this)) {
			customers.insertInBanks(this);
		}
	}
	
	/**
	 * accessor for association to customers
	 */
	public void removeFromCustomers(Customer customers) {
		if (!this.customers.contains(customers)) {
			return;
		}
		this.customers.remove(customers);
		if (customers.getBanks().contains(this)) {
			customers.removeFromBanks(this);
		}
	}
	
	// -- generated code of other cartridges --------------------------------
	
	// -- own code implementation -------------------------------------------
	/* PROTECTED REGION ID(java.class.own.code.implementation._16_0_129203bc_1271068723343_566691_1144) ENABLED START */
	// TODO: put your own implementation code here
	/* PROTECTED REGION END */

}
