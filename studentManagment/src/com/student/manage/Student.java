package com.student.manage;

public class Student {
	private int  studentId;
	private String StudentName;
	private String  phoneNumber;
	private String cityName;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, String phoneNumber, String cityName) {
		super();
		this.studentId = studentId;
		StudentName = studentName;
		this.phoneNumber = phoneNumber;
		this.cityName = cityName;
	}
	public Student(String studentName, String phoneNumber, String cityName) {
		super();
		StudentName = studentName;
		this.phoneNumber = phoneNumber;
		this.cityName = cityName;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	

}
