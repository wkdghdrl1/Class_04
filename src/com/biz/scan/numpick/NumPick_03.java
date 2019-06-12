package com.biz.scan.numpick;

import java.util.Random;
import java.util.Scanner;

public class NumPick_03 {

	private int intNum; // 자동으로 0으로 초기화
	private Random rnd; // 초기화코드(= Random();)를 생성자로 옮김
	private Scanner scan;

	// 생성자 메소드
	public NumPick_03() {
		intNum = 10;
		rnd = new Random();
		scan = new Scanner(System.in);
	}

	public void pickup() {
		int intRnd = rnd.nextInt(10) + 1;
		int count = 0;

		while (true) {
			System.out.print("숫자(1~10)까지 입력,  종료는 end >");
			String strKey = scan.nextLine();
			
			if (strKey.equals("end"))
				break;
			int intKey = Integer.valueOf(strKey.trim());
			++count;

				//  이 코드는 정답을 맞추었을 경우
			// 오답인 경우를 건너 뛰어서
			// Scaaner_06보다는 다소 효율이 높다
			if (intKey == intRnd) {

				System.out.println(count + "번만에 맞추셨네요.");
				intRnd = rnd.nextInt(10) + 1;
				count = 0;
		
			} else {
				if (intKey > intRnd) {
					System.out.println("큰 수를 입력했군요.");

				}
				if (intKey < intRnd) {
					System.out.println("작은 수를 입력했군요.");

				}

			}

		}
		System.out.println("Game Over!!");

	}
}
