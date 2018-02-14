package com.hbuget.vo;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="HbBankAcc")
public class HbBankAcc implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private String bankAccId;
	
	private String bankAccNum;
	
	private String bankAccNam;
	
	private double currentBal;	

	@ManyToOne
	@JoinColumn(name = "BANK_ID", referencedColumnName = "ID")
	private HbBank bank;
	
	@ManyToOne
	@JoinColumn(name = "USER_ID", referencedColumnName = "ID")
	private HbUsers user;

	public String getBankAccId() {
		return bankAccId;
	}

	public void setBankAccId(String bankAccId) {
		this.bankAccId = bankAccId;
	}

	public String getBankAccNum() {
		return bankAccNum;
	}

	public void setBankAccNum(String bankAccNum) {
		this.bankAccNum = bankAccNum;
	}

	public String getBankAccNam() {
		return bankAccNam;
	}

	public void setBankAccNam(String bankAccNam) {
		this.bankAccNam = bankAccNam;
	}

	public double getCurrentBal() {
		return currentBal;
	}

	public void setCurrentBal(double currentBal) {
		this.currentBal = currentBal;
	}

	public HbBank getBank() {
		return bank;
	}

	public void setBank(HbBank bank) {
		this.bank = bank;
	}

	public HbUsers getUser() {
		return user;
	}

	public void setUser(HbUsers user) {
		this.user = user;
	}
	
}
