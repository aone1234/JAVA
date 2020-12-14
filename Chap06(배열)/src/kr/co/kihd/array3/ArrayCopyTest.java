package kr.co.kihd.array3;

import java.util.Arrays;

public class ArrayCopyTest {

	
	public static void main(String[] args) {
		
		int[] origin = new int[] {10, 77, 33, 50};
		int[] target = new int[10];
		int count = 0;
		
		
		System.out.println("복사하기 전");
		System.out.println("target 길이 : " + target.length);
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(target));
		System.out.println(target);
		System.out.println();
		
		
		// 복사방법 1) 직접 복사하는 방법 
//		for(int i=0; i<origin.length; i++) 
//		{
//			target[i] = origin[i];
//		}
		
//		for(int i : origin) 
//		{
//			target[count++] = i;
//		}
		
		
		// 복사방법 2) --복사속도가 가장 빠름.
		System.arraycopy(origin, 0, target, 5, origin.length);
		
		// 복사방법 3) 
		target = Arrays.copyOf(origin, origin.length);
		
		
		System.out.println("복사하기 후");
		System.out.println("target 길이 : " + target.length);
		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(target));
		System.out.println(target);
		System.out.println();
		
		
	}
	
	
}
