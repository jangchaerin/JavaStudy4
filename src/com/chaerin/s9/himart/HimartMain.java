package com.chaerin.s9.himart;

public class HimartMain {

	public static void main(String[] args) {
		//tv, computer, phone객체 만들어서 정보입력
		
		Computer com = new Computer();
		com.company = "삼성";
		com.brand = "갤럭시북";
		com.price = 200;
		com.point = 7;
		com.cpu = "i7";
		
		Phone pho = new Phone();
		pho.company = "애플";
		pho.brand = "아이폰12";
		pho.price = 130;
		pho.point = 2;
		pho.pixcel = 100;
		
		Tv tv = new Tv();
		tv.company = "LG";
		tv.brand = "오브제";
		tv.price = 300;
		tv.point = 10;
		tv.size = 100;
				
		Client iu = new Client();
		iu.money=1000;
		iu.point = 0;
		iu.buy(tv);
		
		
		
		
		
		
	}

}
