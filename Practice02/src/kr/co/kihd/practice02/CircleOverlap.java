package kr.co.kihd.practice02;

import java.util.Scanner;

public class CircleOverlap {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력 >>");
		
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double radius1 = scan.nextDouble();
		
		System.out.print("두번째 원의 중심과 반지름 입력 >>");
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		double radius2 = scan.nextDouble();
		
		/*
		 * 중심점 간의 거리 > 두 반지름의 합 => 두 원은 서로 충돌하지 않음.
		 * 중심점 간의 거리 < 두 반지름의 합 => 두 원은 서로 충돌한 것임.
		 * 중심점 간의 거리 = 두 반지름의 합 => 두 원은 서로 붙어있는 경우임.
		 */
		
		
		// 두 원의 중심점간의 거리 (피타고라스 정리)
		double distance = Math.sqrt((x1-x2) * (x1-x2) + (y1-y2) * (y1-y2));
		
		// 두 원의 반지름의 합
		double radiusSum = radius1 + radius2;
		
		if(distance > radiusSum)
			System.out.println("두 원은 겹치지 않는다");
		else
			System.out.println("두 원은 서로 겹친다");
		
		scan.close();
		

	}

}
