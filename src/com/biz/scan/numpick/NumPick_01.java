package com.biz.scan.numpick;

import java.util.Random;
import java.util.Scanner;

/*
 * main() method가 없는 클래스는
 * helper 클래스라고도 하며
 * 다른 클래스, method에서 객체로 생성하여
 * 사용하는 클래스
 */
public class NumPick_01 {

	// 멤버변수 영여(scope), 필드변수 영역
	// rnd와 scan 객체를 각각의 클래소르 선언만
	//  rnd와 scan에 포한된 method들을 아직 사용할 수 없다.
	
	private Random rnd;
	private Scanner scan;
	
	// 크래스의 생성자 메소드
	// 1. 클래서명과 똑같이9첫글자 대문자 등..) 이름을 정하고 
	// 2. return type이 정의되지 않는다.
	public NumPick_01() {
		rnd = new Random();
		scan = new Scanner(System.in);
	}
	public Scanner getScan()	{
		return scan;
	}
	
}
