package kr.co.kihd.practice02;

import java.util.Scanner;

public class FourRuleCalculationsIf {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("연산 >>");
		
		double operand1 = scan.nextDouble();
		String operator = scan.next();
		double operand2 = scan.nextDouble();
		
		double result = 0;
		if(operator.equals("+")) 
			result = operand1 + operand2;
		else if(operator.equals("-"))
			result = operand1 - operand2;
		else if(operator.equals("*"))
			result = operand1 * operand2;
		else if(operator.equals("/")) 
		{
			if(operand2 == 0) 
			{
			System.out.println("0으로 나눌 수 없습니다.");
			scan.close();
			return;
			}
			else				
				result = operand1 /  operand2; 

		}
		
		else { 
			System.out.println("사칙연산이 아닙니다.");
			scan.close();
			return;
	}
		
		System.out.println(operand1 + operator + operand2 + "의 계산 결과는" + result);
		
		scan.close();
	}
		
	
	
}
