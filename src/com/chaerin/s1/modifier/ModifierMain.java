package com.chaerin.s1.modifier;

import com.chaerin.s2.Test2;

public class ModifierMain {

	public static void main(String[] args) {
		Test test = new Test();//생성자가 private면 같은 패키지여도 객체생성 안됨
		
		int n = 10;
		test.info(n);
		
		//Test2 test2 = new Test2();		//default면 선언은 가능하지만 객체생성 안됨
		
		//test.num = 10;
		//test.num2=20;	//num2는 접근지정자가 default라서 사용 안됨
	
	}

}
