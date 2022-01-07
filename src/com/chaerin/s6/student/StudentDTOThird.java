package com.chaerin.s6.student;

public class StudentDTOThird extends StudentDTOSecond{

	int physics;
	
	public int setTotal() {
		//override //annotation(설명+행동)
		this.total = this.kor+this.eng+this.math+this.history+this.physics;
		System.out.println(this.total);
		return this.total;
	}

	
	}

