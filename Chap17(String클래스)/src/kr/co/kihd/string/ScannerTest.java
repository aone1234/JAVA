package kr.co.kihd.string;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("입력 : ");
		String str = scan.nextLine();
		System.out.println(str);
		
		byte[] b1 = str.getBytes();
		System.out.println(Arrays.toString(b1));
		
		// toCharArray() : 문자열을 char형 배열로 바꾼다.
		char[] ch = str.toCharArray();   // 한글출력
		System.out.println(ch.length);
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i]);
		}
		

	}

}
