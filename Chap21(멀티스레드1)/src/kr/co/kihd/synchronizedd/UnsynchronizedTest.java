package kr.co.kihd.synchronizedd;

public class UnsynchronizedTest {

	public static void main(String[] args) {
		
		// 공유객체 생성
		Calculator calculator = new Calculator();
		
		UserA userA = new UserA();
		userA.setCalculate(calculator);
		
		UserB userB = new UserB();
		userB.setCalculate(calculator);
		
		userA.start();
		userB.start();
		
	}

}
