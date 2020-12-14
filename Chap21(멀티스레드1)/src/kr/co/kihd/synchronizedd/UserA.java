package kr.co.kihd.synchronizedd;

public class UserA extends Thread {
	
	// 공유객체
	private Calculator calculator;
	
	public void setCalculate(Calculator calculator) {
		this.calculator = calculator;
		this.setName("UserA");  			// 스레드 이름 지정
				
	}

	@Override
	public void run() {
		
		this.calculator.print();
		// 공유객체의 필드인 memory 값에 100을 변경
		this.calculator.setMemory(100);
			
	}
	
}
