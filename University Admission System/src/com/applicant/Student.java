package com.applicant;

import java.util.Date;

public class Student {
	private String FirstName;
	private String LastName;
	private Date DOB;
	private String Gender;
	private String Emails;
	private long MobileNumber;
	private String FatherName;
	private double SSCMarks;
	private double HSCMarks;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getEmails() {
		return Emails;
	}
	public void setEmails(String emails) {
		Emails = emails;
	}
	public long getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public double getSSCMarks() {
		return SSCMarks;
	}
	public void setSSCMarks(double sSCMarks) {
		SSCMarks = sSCMarks;
	}
	public double getHSCMarks() {
		return HSCMarks;
	}
	public void setHSCMarks(double hSCMarks) {
		HSCMarks = hSCMarks;
	}
	@Override
	public String toString() {
		return "Student [FirstName=" + FirstName + ", LastName=" + LastName + ", DOB=" + DOB + ", Gender=" + Gender
				+ ", Emails=" + Emails + ", MobileNumber=" + MobileNumber + ", FatherName=" + FatherName + ", SSCMarks="
				+ SSCMarks + ", HSCMarks=" + HSCMarks + "]";
	}
	
	public void addAmount(){
		return add
	}
	
	public void withdrawAmount(){
		return withdraw;
	}
	

}
