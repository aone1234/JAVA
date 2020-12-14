package kr.co.kihd.operator2;

public class BitOperatorTest {

	public static void main(String[] args) {
	
		// &, |, ^ 3개를 비트 연산자라고 함.
		int x = 8;
		int y = 5;
		
		System.out.println("x를 2진수로 변환한 결과 : " + Integer.toBinaryString(x));
		System.out.println("y를 2진수로 변환한 결과 : " + Integer.toBinaryString(y));
		
		//And 연산은 둘다 1일때 1을 출력.
		//OR 연산은 하나라도 1일때 1을 출력.
		//XOR 연산은 둘다 같지 않을때 1을 출력.
		
		System.out.println("x와 y를 비트 &(AND) 연산 결과 : " + (x & y));
		System.out.println("x와 y를 비트 |(OR) 연산 결과 : " + (x | y));
		System.out.println("x와 y를 배타적논리합 ^(XOR) 연산 결과 : " + (x ^ y));
		
	}

}
