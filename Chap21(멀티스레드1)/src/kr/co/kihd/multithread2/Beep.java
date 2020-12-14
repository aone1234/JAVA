package kr.co.kihd.multithread2;

import java.awt.Toolkit;

// 상속을 받아서 스레드 클레스 상속 받음.
public class Beep extends Thread {
	
	@Override
	public void run() {
Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			System.out.println("for문을 실행하는 스레드 이름 : " + 
								Thread.currentThread().getName());
			toolkit.beep();		// 비프음 출력
		
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

    }

}