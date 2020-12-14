package kr.co.kihd.pattern;

import java.util.regex.Pattern;

public class PatternTest1 {

	public static void main(String[] args) {

		// 010, 02 시작하는 휴대푠번호, 서울지역 전화번호를 패턴으로 정의
		String pattern = "(010|02)-\\d{3,4}-\\d{4}";
		String phoneNum = "010-5544-1234";
		String phoneNum1 = "02-766-1234";
		String seoulNum = "053-766-1234";
		
		
		boolean result = Pattern.matches(pattern, phoneNum1);
		result = Pattern.matches(pattern, seoulNum);
		if(result) {
			System.out.println("전화번호 양식이 맞습니다.");
			
		}
		else {
			System.out.println("전화번호 양식이 맞지 않습니다. 다시 입력 해 주세요.");
		}

	}

}
