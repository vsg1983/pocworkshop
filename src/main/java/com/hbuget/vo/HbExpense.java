package com.hbuget.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class HbExpense implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id 
	@Column(name="ID")
	private String expenseId;
	
	private String expenseCat;
	
	private double amountVal;
	
	@OneToOne
	@JoinColumn(name="TRANS_ID",referencedColumnName="ID")
	private HbTransaction tranId;

	public String getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(String expenseId) {
		this.expenseId = expenseId;
	}

	public String getExpenseCat() {
		return expenseCat;
	}

	public void setExpenseCat(String expenseCat) {
		this.expenseCat = expenseCat;
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
