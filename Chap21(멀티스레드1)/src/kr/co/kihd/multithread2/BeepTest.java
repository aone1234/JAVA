package kr.co.kihd.multithread2;

public class BeepTest {

	public static void main(String[] args) {
		
		Thread thread = new Beep();			// 필드의 다형성
		thread.start();

		for(int i=0; i<5; i++) {
			System.out.println("삐웅");
				
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
