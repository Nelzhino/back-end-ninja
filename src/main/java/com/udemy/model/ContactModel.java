package com.udemy.model;


public class ContactModel {

	private Integer id;
	private String firstname;
	private String lastname;
	private String telephone;
	private String city;
	
	
	public ContactModel() {
	
	}


	public ContactModel(Integer id, String firstname, String lastname, String telephone, String city) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.telephone = telephone;
		this.city = city;
	}


	/**
	 * @return the firstName
	 */
	public String getFirstname() {
		return firstname;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	/**
	 * @return the lastName
	 */
	public String getLastname() {
		return lastname;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}


	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}


	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	

	
	
}
