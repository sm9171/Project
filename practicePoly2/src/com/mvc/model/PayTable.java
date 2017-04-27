package com.mvc.model;

import java.util.Scanner;

import com.mvc.view.Output;

public class PayTable extends Salary implements Calculate,Output{
	public PayTable(){}

	public PayTable(String name, int pay, int family, int overtime) {
		super(name, pay, family, overtime);
	}

	@Override
	public void out() {
		calc();
		System.out.println(super.getName()+"  "+super.getPay()+"\t"+super.getFamily()+"\t"+super.getFamilyP()+"\t"+super.getOvertime()+"\t"+super.getOvertimeP()+"\t"+super.getTax()+"\t"+super.getIncentive()+"\t"+super.getIncenP()+"\t"+super.getTotalPay());
	}

	@Override
	public void calc() {
		if(this.getFamily()<3)
			this.setFamilyP(this.getFamily()*20000);
		else
			this.setFamilyP(60000);
		this.setOvertimeP(this.getOvertime()*5000);
		this.setTax((long)(this.getPay()*0.1));
		this.setIncenP((long)(super.getIncentive()*this.getPay()));
		this.setTotalPay(this.getPay()+this.getFamilyP()+this.getIncenP()+this.getOvertimeP()-this.getTax());
	}
	
}
