package com.hbuget.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class HbFamilyMember implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private String famMemId;
	
	private String numOfChilds;

	@OneToOne
	@JoinColumn(name="USER_ID",referencedColumnName="ID")
	private HbUsers users;

	public String getFamMemId() {
		return famMemId;
	}

	public void setFamMemId(String famMemId) {
		this.famMemId = famMemId;
	}

	public String getNumOfChilds() {
		return numOfChilds;
	}

	public void setNumOfChilds(String numOfChilds) {
		this.numOfChilds = numOfChilds;
	}

	public HbUsers getUsers() {
		return users;
	}

	public void setUsers(HbUsers users) {
		this.users = users;
	}
	
}
