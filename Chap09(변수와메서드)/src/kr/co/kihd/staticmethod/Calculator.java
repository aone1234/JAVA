package kr.co.kihd.staticmethod;

public class Calculator {
	
	// 인스턴스 메서드
	// 인스턴스의 특징 : new 연산자로 인스턴스를 생성해야지만, 참조변수명.인스턴스메서드 접근 가능.
	public int add(int x, int y) {
		
		double dresult = Calculator.divide(10.5, 11.7);
		System.out.println("인스턴스 메서드내에서 static 메서드 호출 : " + dresult);
		return x + y;
		
	}
	
	// 인스턴스 메서드
	public int substract(int x, int y) {
		
		return x - y;
				
	}
	
	// static(정적) 메서드
	// static 특징 : 인스턴스 생성없이 클래스명.정적메서드명으로 바로 접근이 가능함.
	public static long multiply(long x, long y) {
		// this.add(10,5); 
		/*
		 * static 메서드는 이미 메모리 상단에 올라가 있고, 
		 * 인스턴스 생성없이 접근이 가능해야 되는데, 
		 * 위의 this.add()코드는 인스턴스가 생성 되어야지만 사용 가능한 것이기에
		 * 예외가 발생한 것임.
		 * 즉, 인스턴스가 언제 생성될지 아무도 모르기 때문에
		 * static 메서드 안에는 인스턴스 메서드가 절대 오면 안됨.
		 * 
		 */
		return x * y;
		
	}
	
	// static(정적) 메서드
	public static double divide(double x, double y) {
		
		return x / y;
		
	}

}
