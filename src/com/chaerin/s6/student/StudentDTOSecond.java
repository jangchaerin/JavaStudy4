package com.chaerin.s6.student;

public class StudentDTOSecond extends StudentDTO {	//상속받겠다는 의미
	
	//여기 그럼 name, num, kor, eng, math 다 있다고 생각
	int history;	//추가되는거만 새로 선언
	
	public int setTotal() {
		//overriding
		this.total = this.kor+this.eng+this.math+this.history;
		System.out.println(this.total);
		return this.total;
	}

}
