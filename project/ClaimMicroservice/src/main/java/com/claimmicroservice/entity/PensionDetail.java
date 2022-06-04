package com.claimmicroservice.entity;

import java.util.ArrayList;
import java.util.List;

public class PensionDetail {
	//private List<PensionAmount> pensionamount=new ArrayList<PensionAmount>();
	private double pensionamount;
	private double bankservicecharge;
	
	/*public List<PensionAmount> getPensionamount() {
		return pensionamount;
	}
	public void setPensionamount(List<PensionAmount> pensionamount) {
		this.pensionamount = pensionamount;
	}*/
	
	public double getBankservicecharge() {
		return bankservicecharge;
	}
	public double getPensionamount() {
		return pensionamount;
	}
	public void setPensionamount(double pensionamount) {
		this.pensionamount = pensionamount;
	}
	public void setBankservicecharge(double bankservicecharge) {
		this.bankservicecharge = bankservicecharge;
	}
	
	
}
