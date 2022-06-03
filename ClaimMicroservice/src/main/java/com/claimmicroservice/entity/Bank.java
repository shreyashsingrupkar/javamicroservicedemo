package com.claimmicroservice.entity;

public class Bank {

	private long id;
	private String bankname;
	private long accountnumber;
	private String banktype;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getBanktype() {
		return banktype;
	}
	public void setBanktype(String banktype) {
		this.banktype = banktype;
	}
	
	
}
