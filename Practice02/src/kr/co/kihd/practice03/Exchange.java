package kr.co.kihd.practice03;

// 164쪽 6번

import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) {
	
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("금액을 입력하시오>> ");
		int money = scan.nextInt();
		
		for(int i=0; i < unit.length; i++) {
			int result = money / unit[i];   // unit[i]의 몫 계산

			if(result > 0) {                // 몫이 있는 경우
				System.out.println(unit[i] + "원 짜리" + result + "개");
				money = money % unit[i]; // money를 나머지로 갱신
				
			}
			
		}
		
		
		scan.close();
		
	}
	
}
