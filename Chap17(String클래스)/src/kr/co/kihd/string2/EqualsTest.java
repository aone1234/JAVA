package kr.co.kihd.string2;

public class EqualsTest {

	public static void main(String[] args) {
		
		String str1 = new String("최지만");
		String str2 = "최지만";			  // 리터럴 타입으로 대입
		String str3 = "최지만";
		
		// == 연산자 : 주소비교
		if(str1 == str2) {
			System.out.println("같은 번지의 인스턴스");
		}
		else {
			System.out.println("다른 번지의 인스턴스");
		}
		
		System.out.println("\n==============\n");
		
		if(str2 == str3) {
			System.out.println("같은 번지의 인스턴스");			
		}
		else {
			System.out.println("다른 번지의 인스턴스");
		}
		
		System.out.println("\n==============\n");
		// String의 equals() : 값 비교함.(Object 클래스의 equals() 오버라이딩)
		if(str1.equals(str2)) {
			System.out.println("같은 문자열 입니다.");
		}
		else {
			System.out.println("다른 문자열 입니다.");
		}
		
		System.out.println("\n==============\n");
			
		if(str2.equals(str3)) {
			System.out.println("같은 문자열 입니다.");
		}
		else {
			System.out.println("다른 문자열 입니다.");
		}
	
	}

}
