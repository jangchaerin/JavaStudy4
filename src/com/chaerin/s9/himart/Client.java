package com.chaerin.s9.himart;

public class Client {
	
	int money;
	int point;
	
	public void buy(Electronic e) {
		this.money = this.money-e.price;
		this.point = this.point + e.point;
		
		System.out.println("최종금액 : "+this.money);
		System.out.println("최종 포인트 : "+this.point);
	}

	

}
