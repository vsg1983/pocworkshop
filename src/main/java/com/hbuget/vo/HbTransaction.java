package com.hbuget.vo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class HbTransaction implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private String transactionId;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date transDate;
	
	private String transMessage;

	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="bank_acc_id", referencedColumnName = "ID")
	private HbBankAcc bankscc;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="bill_id", referencedColumnName = "ID")
	private HbBills bill;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	

	public Date getTransDate() {
		return transDate;
	}

	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}

	public String getTransMessage() {
		return transMessage;
	}

	public void setTransMessage(String transMessage) {
		this.transMessage = transMessage;
	}
	
	public HbBankAcc getBankscc() {
		return bankscc;
	}

	public void setBankscc(HbBankAcc bankscc) {
		this.bankscc = bankscc;
	}

	public HbBills getBill() {
		return bill;
	}

	public void setBill(HbBills bill) {
		this.bill = bill;
	}
}
