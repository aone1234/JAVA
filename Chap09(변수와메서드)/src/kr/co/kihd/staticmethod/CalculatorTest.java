package kr.co.kihd.staticmethod;

public class CalculatorTest {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		int addResult = cal.add(100, 200);
		System.out.println("인스턴스 메서드 add() 호출결과 : " + addResult);
		
		long mulResult = Calculator.multiply(100, 20);
		System.out.println("static 메서드 multiply() : " + mulResult);
		
		double divResult = Calculator.divide(100.2, 10.2);
		System.out.println("static 메서드 divide() : " + divResult);
		
		Integer.parseInt("100");
		Math.random();
		
	}

}
