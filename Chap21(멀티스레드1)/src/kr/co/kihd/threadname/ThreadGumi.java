package kr.co.kihd.threadname;

public class ThreadGumi extends Thread {
	
	public ThreadGumi() {
	
		this.setName("ThreadGumi");		// 스레드의 이름을 지정하고 있다.
				
	}
	
	@Override
	public void run() {
		System.out.println("[현재 실행 중인 스레드]" + this.getName());
		
		for(int i = 0; i<5; i++) {
			System.out.println(this.getName() + "가 출력한 내용 : " + i);
		}
		
	}

}
