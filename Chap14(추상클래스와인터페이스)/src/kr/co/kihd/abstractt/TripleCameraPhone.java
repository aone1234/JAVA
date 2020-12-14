package kr.co.kihd.abstractt;

public class TripleCameraPhone extends Phone {
	
	public TripleCameraPhone(int serialNo, String company, String owner) {
		super(serialNo, company, owner);
		// TODO Auto-generated constructor stub
	}


	public void turnOn() {
		System.out.println("트리플 카메라폰이 켜졌습니다.");
	
	}
	public void turnOff() {
		System.out.println("트리플 카메라폰이 꺼졌습니다.");
	
	}
	
	// 자체 메서드 2개
	public void cameraOn() {
		System.out.println("망원 기능이 사용 됩니다.");
	
}
	
	public void cameraOff() {
		System.out.println("망원 기능이 중지 됩니다.");
	}
	
}	