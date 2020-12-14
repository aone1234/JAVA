package kr.co.kihd.threadgroup2;

public class WorkThread extends Thread {
	
	public WorkThread(ThreadGroup threadGroup, String threadname) {
		super(threadGroup, threadname);		// 조상 클래스의 매개변수가 있는 생성자 호출
		
	}

	@Override
	public void run() {
		// 현재 실행되고 있는 스레드 그룹을 얻음
		ThreadGroup mainGroup = 
				Thread.currentThread().getThreadGroup();
		String str = mainGroup.getName();
		System.out.println("스레드 그룹 이름 : " + str);
		
		while(true) {
			// 스레드 너무 빨리 실행되어 sleep() 추가
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(this.getName() + " 인터럽트 호출됨!");
				break;
			}
			
		}
		System.out.println(this.getName() + "종료됨");
	}
	
}
