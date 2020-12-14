package kr.co.kihd.practice02;

import java.util.Scanner;

//실습문제 6번

public class Samyukgu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, count = 0;
		
		System.out.println("1~99 사이의 정수를 입력하시요>>");
		num = scan.nextInt();
		
		if(num >=1 && num <=99) {
		   int samyukgu1, samyukgu2;
		   samyukgu1 = num/10;       //10자리에서 3,6,9 검사
		   samyukgu2 = num%10;       // 1자리에서 3,6,9 검사
		   
		   if(samyukgu1 != 0 && samyukgu1 % 3 == 0)
			  count++;            // 10의 자리 정수에 3,6,9중 하나가 있는 경우 count증가
		   if(samyukgu2 != 0 && samyukgu2 % 3 == 0)
				  count++;        //  1의 자리 정수에 3,6,9중 하나가 있는 경우 count증가
		   if(count == 2) System.out.println("박수 짝짝");
		   else if(count == 1) System.out.println("박수 짝");
		   else System.out.println("박수 없음");
		   		   
		}
		
		else {
			System.out.println("숫자가 범위를 벗어났습니다.");
		}
		
		scan.close();
		
				
	}

}
