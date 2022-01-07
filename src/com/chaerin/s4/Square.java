package com.chaerin.s4;

public class Square {
	
	//얘네들은 멤버변수
	final int GARO;	//public static 을 써주면 이제 멤버변수는 아니다. 공통의 클래스의 변수이다.
	public static int sero;		//static인 애들은 객체를 생성해주지 않아도 사용가능하다.
								//heap에 생성 되는게 아니라 메소드 영역에 셍성
	public Square() {
		this.GARO = 3;
	}
	static {
		Square.sero = 3;
	}

	public static void info() {
		System.out.println("class method");
		//System.out.println(this.garo);
		System.out.println(Square.sero);
		//this.info2();
	}
	public void info2(){
		
		final int NUM = 1;
		//NUM=2;
		System.out.println("Instance Method");
		System.out.println(Square.sero);	
		Square.info();		//클래스 호출 가능
	}
	
}
