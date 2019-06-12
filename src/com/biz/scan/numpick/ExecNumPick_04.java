package com.biz.scan.numpick;

public class ExecNumPick_04 {

	public static void main(String[] args) {

		NumPick_04 np = new NumPick_04();

		np.makeRandom(); // 새로운 숫자1개 생성

		// 키보드에서 만약 --END가 입력됐으면
		// 나머지 코드를 더이상 진행하지 않도록 한다.
		// 숫자 1부터 10까지 중에서 입력됐으면
		// 숫자 비교를 해서 나머지 부분을 실행
		while (true) {
			boolean bExit = np.keyInput();

			if (bExit) {
				System.out.println("Game over!!!!!!!!!!!!!!");
				break;
			} else {
				int result = np.pickup();
				if(result == 0) {
					System.out.println("참 잘했어요");
					System.out.println(np.getCount() + "번째에 맞췄네요!!");
					np.resetCount();
				}else if(result > 0){
					System.out.println("큰 수를 입력햇네요");
				}else {
					System.out.println("작은 수를 입력했네요");
				}
				// System.out.println("to be continue");
			}
		}
	}
}
