package kr.co.kihd.array;

import java.util.Arrays;

public class ArrayTest4 {

	public static void main(String[] args) {
      
		int[] ball = new int[5];
		
		for(int i=0; i<ball.length; i++) 
		{
			ball[i] = (int)(Math.random() * 45) + 1;
		}
			
		System.out.println("정렬 전");
		for(int i=0; i<ball.length; i++) 
		{
			System.out.print(ball[i] + "  ");
		}

		System.out.println();
		
		// 버블소팅(정렬)을 위해서는 반드시 1차원 배열이라도 더블루프가 필요하고
		// 조건문이 하나 들어와야 함.
//		for(int i=0; i<ball.length; i++) 
//		{
//			for(int j=0; j<ball.length-1; j++) 
//		{
//				// 버블정렬
//				if(ball[j] > ball[j+1]) 
//				{
//					int temp = ball[j];
//					ball[j] = ball[j+1];
//					ball[j+1] = temp;					
//				}
//				
//				
//			}
//			
//		}
		
		Arrays.sort(ball); // 위에 for문을 기능을 한 줄로 구현.
		
		System.out.println("정렬 후");
		for(int i=0; i<ball.length; i++) 
		{
			System.out.print(ball[i] + "  ");
		}
		
	}

}
