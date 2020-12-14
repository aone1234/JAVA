package kr.co.kihd.practice02;

import java.util.Scanner;

public class FourRuleCalculationsSwitch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("연산 >>");
		
		int operand1 = scan.nextInt();
		String operator = scan.next();
		int operand2 = scan.nextInt();
		
		int result = 0;
		switch(operator)
		{
		case "+" :
			result = operand1 + operand2;
				
		case "-" :
			result = operand1 - operand2;
		
		case "*" :
			result = operand1 * operand2;
		
		case "/" :
			if(operand2 == 0)
			{
				System.out.println("0으로 나눌 수 없습니다.");
				scan.close();
				return;
			}
			result = operand1 / operand2;
			break;
			
		default:
			System.out.println("사칙연산이 아닙니다.");
			scan.close();
			return;
		
		
	    }
		
		System.out.println(operand1 + operator + operand2 + "의 계산 결과는" + result);
		
		scan.close();
	}
		
	
	
}
