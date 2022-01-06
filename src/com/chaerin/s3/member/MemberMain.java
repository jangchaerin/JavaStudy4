package com.chaerin.s3.member;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Member member = new Member();
		member.setAge(400000);
		System.out.println(member.getAge());
		
		member.setCm(165.5);
		System.out.println(member.getCm());
		
		member.setEmail("cofls3928@naver.com");
		//String email = member.getEmail();		//19번줄이랑 같음
		//System.out.println(email);
		System.out.println(member.getEmail());
	}
}
