package kr.co.kihd.string2;

public class SubStringTest {

	public static void main(String[] args) {

		String phoneNum = "01012347890";
				
		// subString() : 문자열을 잘라내어 String으로 변환
		String str1 = phoneNum.substring(3);
		System.out.println(str1);
		
		// 마지막 인덱스는 미포함.
		String str2 = phoneNum.substring(0, 3);
		System.out.println(str2);
		

	}

}
