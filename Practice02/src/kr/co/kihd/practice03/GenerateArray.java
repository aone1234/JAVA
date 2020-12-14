package kr.co.kihd.practice03;

import java.util.Scanner;

public class GenerateArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("정수 몇개?>> ");
		int num = scan.nextInt();
		
		if(num<= 1 || num > 100) {
			System.out.println("1~100 사이로 입력하세요!");
			scan.close();
			return;				// 프로그램 종료
			
		}

		// num개의 정수 배열 생성
		int[] array = new int[num];
		
		for(int i=0; i<array.length; i++) {
			// 1~100범위의 랜덤 정수
			int intNum = (int)(Math.random() * 100 + 1);
			if(exist(array, i, intNum)) {
				i--;
				continue;
				
			}
			array[i] = intNum;
		}
		
		// 배열 출력
		for(int i=0; i<array.length; i++) {
			if(i%10 ==0)
				System.out.println();  // 다음줄로
			System.out.print(array[i] + "  ");
		}
		
		scan.close();
	}
	
	// 정수 intNum가 이미 배열 array[0]~array[i-1]에 있는지 검사
	public static boolean exist(int[] array, int to, int intNum) {
		
		for(int j=0; j<to; j++) {
			
			if(array[j] == intNum) {
				return true;        // 일치하는 것이 존재함.
				
				
			}
			
		}
		return false;
		
	}

}
