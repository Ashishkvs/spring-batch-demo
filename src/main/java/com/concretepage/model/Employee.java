package com.concretepage.model;
public class Employee {
	private long empCode;
	private String empName;
	private int expInYears;
	public long getEmpCode() {
		return empCode;
	}
	public void setEmpCode(long empCode) {
		this.empCode = empCode;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getExpInYears() {
		return expInYears;
	}
	public void setExpInYears(int expInYears) {
		this.expInYears = expInYears;
	}
}