package com.biz.scan.numpick;

import java.util.Random;
import java.util.Scanner;

public class NumPick_04 {

	private int intNum; // 자동으로 0으로 초기화
	private Random rnd; // 초기화코드(= Random();)를 생성자로 옮김
	private Scanner scan;
	private int intRnd;
	private int count;
	private int intKey;
	
	public void resetCount() {
		count = 0;
	}
	
	public int getCount() {
		return count;
	}

	// 생성자 메소드
	public NumPick_04() {
		intNum = 10;
		rnd = new Random();
		scan = new Scanner(System.in);
	}

	public void makeRandom() {
		intRnd = rnd.nextInt(10) + 1;
	}

	public boolean keyInput() {
		System.out.print("숫자(1~10)까지 입력,  종료는 end >");
		String strKey = scan.nextLine();
		 ++count;
		if (strKey.equals("end")) {
			return true;
		}
		intKey = Integer.valueOf(strKey);
		return false;
	}

	public int pickup() {

		int ret = intKey - intRnd;
		if (ret == 0) {
			intRnd = rnd.nextInt(10) + 1;
			// count = 0;
		}
		return ret;

	}
}
