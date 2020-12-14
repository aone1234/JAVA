package kr.co.kihd.overriding2;

public class CarTest {
	
	public static void main(String[] args) {
		Car car = new Car(80);
		car.speedUp();
		car.speedDown();
		car.stop();
		
		System.out.println();
		
		SportCar sportCar = new SportCar(150);
		sportCar.speedUp();      // 조상 클래스의 speedUp() 호출
		sportCar.speedDown();    // 조상 클래스의 speedDown() 호출
		sportCar.stop();         // 자손 클래스의 stop() 호출
		
	}

}
