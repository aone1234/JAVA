package kr.co.kihd.synchronizedd;

// 공유객체
public class Calculator {
	
	private int memory;
	int value = 100;
	
	public int getMemory() {
		return this.memory;
		
	}
	
	// 동기화 메서드 => 데이터 신뢰성을 보장하기 위해서 반드시 동기화 처리가 필수다.
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		// 1초간 일시정지
		// System.out.println(Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + 
						   " : " + this.getMemory());		
	}
	
	public synchronized void print() {
		System.out.println(Thread.currentThread().getName() + 
				   			" " + "Value 값 : " + this.value);
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName() + 
		   						" " + i);
		}
	}
	
}
