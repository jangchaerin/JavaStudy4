package com.chaerin.s3.member;

public class Member {
	
	private String name;		//이름
	private String email;		//이메일주소
	private double kg;			//몸무게
	private double cm;			//키
	private int age;			//나이
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getKg() {
		return kg;
	}
	public void setKg(double kg) {
		this.kg = kg;
	}
	public double getCm() {
		return cm;
	}
	public void setCm(double cm) {
		this.cm = cm;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}