package kr.co.kihd.abstractt;

public class PhoneTest {

	public static void main(String[] args) {

		// 추상 클래스는 인스턴스를 생성 할 수 없다
		// Phone phone = new Phone();
//		Phone smartPhone = new SmartPhone(201106, "LG-V50", "최지만");
//		smartPhone.
		
		SmartPhone smartPhone = new SmartPhone(201106, "LG-V50", "최지만");
	    smartPhone.showInfo();
		smartPhone.turnOn();
		smartPhone.turnOff();
		smartPhone.internetSearch();
		
		
		System.out.println("-------------------------------------------------");
		
		TripleCameraPhone triplePhone = new TripleCameraPhone(201112, "iPhone12 pro", "류현진");
		
		triplePhone.showInfo();
		triplePhone.turnOn();
		triplePhone.turnOff();
		triplePhone.cameraOn();
		triplePhone.cameraOff();
		
		System.out.println("-------------------------------------------------");
		
		Phone[] phone = new Phone[10];
		phone[0]  = new SmartPhone(201106, "LG-V50", "추상수");
		phone[1]  = new TripleCameraPhone(201112, "iPhone12 pro", "류현진");
		
		
		// 원래 타입이 Phone 이니깐 SmartPhone 이나 TripleCameraPhone 폰에 
		// 선언되어 있는 메서드는 사용을 못한다. 원래타입이 Phone 이니까.
		phone[0].turnOn();
		phone[1].showInfo();
		
		System.out.println("-------------------------------------------------");
		phone[1].turnOff();
		phone[1].turnOn();
		
	}

}
