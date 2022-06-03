package com.claimmicroservice.entity;



public class PensionerDetails {

	private long id;
	private String name; //<Pensioner name>
	private String dob; // Date of birth //<Pensioner date of birth>
	private String pan;//3. PAN//<Permanent account number>
	private double salaryearned;//4. SalaryEarned//<Last earned salary by the pensioner>
	private double allowances;//5. Allowances//<Sum of all the allowances>
	private String self_or_family_pension;//6. Self or Family pension//<Is the pension classification
	private long aadharno;
	private Bank bank;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public double getSalaryearned() {
		return salaryearned;
	}
	public void setSalaryearned(double salaryearned) {
		this.salaryearned = salaryearned;
	}
	public double getAllowances() {
		return allowances;
	}
	public void setAllowances(double allowances) {
		this.allowances = allowances;
	}
	public String getSelf_or_family_pension() {
		return self_or_family_pension;
	}
	public void setSelf_or_family_pension(String self_or_family_pension) {
		this.self_or_family_pension = self_or_family_pension;
	}
	public long getAadharno() {
		return aadharno;
	}
	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
	
}
