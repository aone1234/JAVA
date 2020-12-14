package kr.co.kihd.operator3;

public class AssignOperTest {

	public static void main(String[] args) {

		// 복합대입 연산자를 이해해 보기
		int result = 0;
		
		//복합 대입 연산자는 값을 누적 시킬때 많이 사용함.
		
		result += 10;            //result = result + 10;
		System.out.println("result : " + result);
		
		result -= 5;             //result = result - 5;
		System.out.println("result : " + result);
		
		result *= 5;             //result = result * 5;
		System.out.println("result : " + result);
		
		result /= 5;             //result = result / 5;
		System.out.println("result : " + result);
		
		result %= 5;             //result = result % 5;
		System.out.println("result : " + result);
		
		
		

	}

}
