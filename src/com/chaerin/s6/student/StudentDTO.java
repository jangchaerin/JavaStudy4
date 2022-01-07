package com.chaerin.s6.student;

public abstract class StudentDTO {

	//StudentDTO 가 공통요소만 가지고 있기 때문에 부모클래스
	
	String name;
	int num;
	int kor;
	int eng;
	int math;
	int total;
	
	public abstract int setTotal();
	
}
