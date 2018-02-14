package com.hbuget.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class HbIncome implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@Column(name="ID")
	private String incomeId;
	
	private String incomeCat;
	
	private double amountVal;
	
	@OneToOne
	@JoinColumn(name="TRANS_ID",referencedColumnName="ID")
	private HbTransaction tranId;

	public String getIncomeId() {
		return incomeId;
	}

	public void setIncomeId(String incomeId) {
		this.incomeId = incomeId;
	}

	public String getIncomeCat() {
		return incomeCat;
	}

	public void setIncomeCat(String incomeCat) {
		this.incomeCat = incomeCat;
	}

	public double getAmountVal() {
		return amountVal;
	}

	public void setAmountVal(double amountVal) {
		this.amountVal = amountVal;
	}

	public HbTransaction getTranId() {
		return tranId;
	}

	public void setTranId(HbTransaction tranId) {
		this.tranId = tranId;
	}
}
