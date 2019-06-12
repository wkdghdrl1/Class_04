package com.biz.scan;

import java.util.Scanner;

public class Scanner_03 {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			// 두 개의 숫자를 입력받아서 사칙연산을 수행
			
			int num1 = 0;
			int num2 = 0;
			
			// 키보드에서는 문자열 데이터로 숫자를 입력받고
			// 실제로 정수로 변환하는 작업을 해주는 것이 좋다.
			
			System.out.println("숫자1>");
			String strKey1 = scan.nextLine();
			
			num1 = Integer.valueOf(strKey1); // 문자열형 숫자를 정수로 변환
//			num1 = Integer.parseInt(strKey1); 
//			Float.valueOf(num2)
			
			System.out.println("숫자2>");
			String strKey2 =  scan.nextLine();
			num2 = Integer.valueOf(strKey2);

			System.out.printf("%d + %d = %d ", num1, num2, num1+num2);
			
			
		}
}
