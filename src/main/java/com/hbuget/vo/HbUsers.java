package com.hbuget.vo;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class HbUsers implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private String userId;
		
	private String status;
	
	private String username;
	
	private String password;
	
	@OneToMany
	private Collection<HbBankAcc> bankAcc;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<HbBankAcc> getBankAcc() {
		return bankAcc;
	}

	public void setBankAcc(Collection<HbBankAcc> bankAcc) {
		this.bankAcc = bankAcc;
	}	
	
	
}

