package kr.co.kihd.string2;

public class ReplaceTest {

	public static void main(String[] args) {

		// replace() : 문자열을 대체하는 메서드 입니다.
		String oldstr = "자바는 객체지향언어 입니다.";
		String newstr = oldstr.replace("자바", "JAVA");
		System.out.println(newstr);
		System.out.println(newstr.toString());
		
		System.out.println(oldstr.hashCode());
		System.out.println(newstr.hashCode());

	}

}
