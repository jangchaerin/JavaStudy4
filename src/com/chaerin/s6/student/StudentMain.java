package com.chaerin.s6.student;

public class StudentMain {

	public static void main(String[] args) {

		
		StudentDTOSecond ss= new StudentDTOSecond();
		ss.kor = 10;
		ss.eng = 20;
		ss.math = 30;
		ss.history = 40;
		ss.setTotal();
		StudentDTOThird st= new StudentDTOThird();
		st.kor = 10;
		st.eng = 20;
		st.math = 30;
		st.history = 40;
		st.physics = 50;
		st.setTotal();
		
	}

}
