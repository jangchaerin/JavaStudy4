package com.chaerin.s6.student;

public class StudentSecondService extends StudentService{

	@Override
	public  StudentDTO setStduent() {
		// studentDTOSecond 입력하는코드생성
		StudentDTOSecond studentDTOSecond = new StudentDTOSecond();
		
		return studentDTOSecond;
	}

}
