package kr.co.kihd.operator3;

import java.util.Scanner;

public class ThreeOperTest {

	public static void main(String[] args) {
	 
		// 삼항 연산자를 사용하는 방법 익히기
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = scan.nextInt();
		
		//(조건식) ? 1 : 2;	
//		char grade = (score >= 90) ? 'A' : 'B';	
//		System.out.println("당신의 등급 : " + grade);		

		//삼항연산자 중첩사용		
		char grade = (score >= 90) ? 'A' : ((score >= 80) ? 'B' : 'C');
		System.out.println("당신의 등급 : " + grade);
		
		
		
		
		
		
		

	}

}
