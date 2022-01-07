package com.chaerin.s5;

public class MyGod {
	private static MyGod mygod;
	private MyGod() {
	
	}
	
	public static MyGod makeGod() { //멤버메소드
		
//		this.myGod        //this 못쓴다 static메소드는 메인 전에 만들어진다.
		
		return new MyGod();
		
	}

}
