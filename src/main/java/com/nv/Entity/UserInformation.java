/**
 * 
	File : UserInformation.java
	Author : Nishant Varshney
 */


package com.nv.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author nishant.varshney
 *
 */

@Entity
@Table(name="UserInfo")
public class UserInformation implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="User_ID")
	private Integer userId;
	
	@Column(name="User_Name")
	private String userName;
	
	@Column(name="Password")
	private String Password;

	
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public UserInformation(Integer userId, String userName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		Password = password;
	}

	public UserInformation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserInformation(String userName, String password) {
		super();
		this.userName = userName;
		Password = password;
	}
	
	
	
	
}
