package kr.co.kihd.state;

public class ThreadStateTest {

	public static void main(String[] args) {
		
		// 스레드의 라이프 사이클을 알아보는 내용
		Thread thread = new StatePrintThread(new TargetThread());
		thread.start();
	}

}
