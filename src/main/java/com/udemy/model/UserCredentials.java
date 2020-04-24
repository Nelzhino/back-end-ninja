package com.udemy.model;

public class UserCredentials {

	private String username;
	private String password;
	
	
	public UserCredentials() {
		super();
	}

	public UserCredentials(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	/**
	 * @return the userName
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
}
