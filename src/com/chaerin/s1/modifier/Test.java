package com.chaerin.s1.modifier;

class Test { 	//public 생략해도 같은 패키지 내에서는 사용ㄱ ㅏ능

	private int num;	//변수도 접근지정자 안써주면 default 같은 패키지에서만 사용할 수 있다

	public Test() {		//생성자
		
	}
	public void info(int num) {	//()안의 num은 외부에서 받는 숫자
		this.num = num;
		System.out.println(this.num);
	}
	
}
