package com.biz.scan;

import java.util.Random;
import java.util.Scanner;

public class Scanner_05 {

	public static void main(String[] args) {
		
		/* 1부터 10까지 임의의 난수를 하나 만들고
		 * 키보드로부터 1부터 10까지 숫자를 입력받아서
		 * 난수를 맞추는 게임
		 * 기존 게임은 기회가 1번만 주어지지만
		 * 몇번의 기회를 준다.
		 */
		Scanner scan =  new Scanner(System.in);
		Random rnd = new Random();
		int intRnd = rnd.nextInt(10) + 1;
		int count = 0;
		// 몇번만에 숫자를 맞추었는지 알아보고
		// 숫자를 맞추면
		// * 번만에 맞추었네 라고 메시지 보여쥐
		while(true) {
			System.out.print("숫자(1~10)까지 입력 >");
			String strKey = scan.nextLine();
			int intKey = Integer.valueOf(strKey.trim());
			 ++count;
			if(intKey == intRnd) {
				
				System.out.println(count +"번만에 맞추셨네요." );
				break;
			}
			if(intKey >  intRnd) {
				System.out.println("큰 수를 입력했군요.");
				System.out.println("작은 수를 입력했군요.");
			
			
			}else if(intKey < intRnd) {
				System.out.println("작은 수를 입력했군요.");
				
				
			}
		}
		System.out.println("Game Over!!");
	}
}
