package kr.co.kihd.abstractt;

public class SmartPhone extends Phone {

	public SmartPhone(int serialNo, String company, String Owner) {
		super(serialNo, company, Owner);
	}
	
	
	public void turnOn() {
		System.out.println("스마트폰이 켜졌습니다.");
		
	}
	public void turnOff() {
		System.out.println("스마트폰이 꺼졌습니다.");
		
	}
		
	// 자체메서드 1개
	public void internetSearch() {
		System.out.println("구글 검색을 합니다!");
		
	}

	
}
