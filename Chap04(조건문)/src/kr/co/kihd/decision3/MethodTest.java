package kr.co.kihd.decision3;

public class MethodTest {

	//메서드의 선언부 구성
    /*
     * 1)리턴타입(반환값) : int
     * 2)메서드명
     * 3)() : 매개변수, 인자값, Arguments
     */
	
	public static int add(int x, int y) {
		System.out.println("add() 메서드 호출됨");
		int temp = 0;
		temp = x + y;
		
		return temp;
		
		
	}
	
	//minus(), multiply(), divide()
	public static int minus(int x, int y) {
		System.out.println("minus() 메서드 호출됨");
		int temp = 0;
		temp = x - y;
		
		return temp;
	}	
	
	public static int multiply(int x, int y) {
		System.out.println("multiply() 메서드 호출됨");
		int temp = 0;
		temp = x * y;
			
		return temp;
	}	
	
	public static int divide(int x, int y) {
		System.out.println("divide() 메서드 호출됨");
		int temp = 0;
		temp = x / y;
			
		return temp;
			
	}	
	
	
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 30;

		
		//int result = num1 + num2;
		
		//값에 의한 복사(Call by value)
		int result = add(num1, num2);
		System.out.println("num1 + num2 : " + result);
		
		result = MethodTest.minus(num1, num2);
		System.out.println("num1 - num2 : " + result);
		
		result = multiply(num1, num2);
		System.out.println("num1 - num2 : " + result);
				
		result = divide(num1, num2);
		System.out.println("num1 - num2 : " + result);
		
		
	}

}





