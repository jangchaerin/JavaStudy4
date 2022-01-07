package com.chaerin.s5;

public class MyGodMain {
	public static void main(String[] args) {
	
		//전체프로그램에서 객체를 한개만 생성해서 사용 singleton
		//클래스메소드 hint -> 객체를 생성하지않고 사용가능하다
		//mygod이 딱 한개만 
		//어디서 프린트 되든 주소가 같아야함
		
		MyGod mygod = MyGod.makeGod();
		System.out.println(mygod);
		
		MyGod my2 = MyGod.makeGod();
		System.out.println(my2);
		System.out.println(MyGod.makeGod());

	}

}
