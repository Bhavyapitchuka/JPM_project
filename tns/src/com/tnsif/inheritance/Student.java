package com.tnsif.inheritance;

public class Student extends Citizen{
	private int rollno;
	private String collegename;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String address, long aadharno, long phoneno) {
		super(name,address,aadharno,phoneno);
		this.rollno = rollno;
		this.collegename = collegename;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public Student(int rollno, String collegename) {
		super();
		this.rollno = rollno;
		this.collegename = collegename;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegename=" + collegename + "]";
	}
	
}
