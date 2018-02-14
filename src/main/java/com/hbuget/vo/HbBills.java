package com.hbuget.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HbBills implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private String billId;
	
	@Column(name="BILL_NUMBER")
	private String billNum;
	
	@Column(name="BILL_SNAPSHOT")
	private byte[] billSnap;

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public String getBillNum() {
		return billNum;
	}

	public void setBillNum(String billNum) {
		this.billNum = billNum;
	}

	public byte[] getBillSnap() {
		return billSnap;
	}

	public void setBillSnap(byte[] billSnap) {
		this.billSnap = billSnap;
	}
	
}
