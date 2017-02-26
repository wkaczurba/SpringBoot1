package com;

public class Customer {
	private long Id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String emailAddress;
	/**
	 * @return the id
	 */
	private final long getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	private final void setId(long id) {
		Id = id;
	}
	/**
	 * @return the firstName
	 */
	private final String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	private final void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	private final String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	private final void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the phoneNumber
	 */
	private final String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	private final void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the emailAddress
	 */
	private final String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	private final void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	  
  
  
  
}
