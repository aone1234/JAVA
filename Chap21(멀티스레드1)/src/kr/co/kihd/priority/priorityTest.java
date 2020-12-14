package kr.co.kihd.priority;

public class priorityTest {

	public static void main(String[] args) {
		
		// 메인 스레드
		Thread thread0 = Thread.currentThread();
		System.out.println(thread0.getName() + " : " + thread0.getPriority());
		
		for(int i = 1; i <= 20; i++) {
			Thread thread = new CalcThread("Thread : " + i);
			
			// Thread 1,2,3,4는 우선순위가 가장 낮다.
			if(i != 20) {
				thread.setPriority(thread.MIN_PRIORITY);
				// thread.setPriority(1);  // 위와 동일
			}			
			else {
				// Thread 5는 우선순위가 10으로 가장 높다.
				thread.setPriority(thread.MAX_PRIORITY);
				// thread.setPriority(10);  
			}
			thread.start();
		}
		
		/*
		 * 우선순위가 10으로 주었다하나, 작업을 마치는 빈도가 높을뿐이지
		 * 무조건 100% 먼저 끝낸다는 보장이 없다.
		 * 결론적으로 자바는 순환할당(Round-Robin) 방식을 사용하고 있기 때문에,
		 * CPU 스케쥴러의 상태에 따라 달라진다. 
		 */

	}

}
