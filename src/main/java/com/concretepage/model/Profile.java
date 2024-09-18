package com.concretepage.model;
public class Profile {
	private long empCode;	
	private String empName;
	private String profileName;
	public Profile(long empCode, String empName, String profileName) {
		this.empCode = empCode;
		this.empName = empName;
		this.profileName = profileName;
	}
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
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
}