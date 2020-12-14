package kr.co.kihd.overriding;

public class HddDisk extends Object {
	
	// 멤버변수
	int capacity;				// 용량
	int rpm;					// 속도
	
	// 기본 생성자
	public HddDisk() {
		
	}
	
	// 매개변수가 있는 생성자
	public HddDisk(int capacity, int rpm) {
		
		this.capacity = capacity;
		this.rpm = rpm;
		
	}	
	
	// hddDisk의 사용자 정의 메소드
	public String status() {
		
		String str = "하드디스크 용량 : " + this.capacity + "\n" +
				     "하드디스크 속도 : " + this.rpm + "(rpm)";
		
		return str;
		
	}
		
}
