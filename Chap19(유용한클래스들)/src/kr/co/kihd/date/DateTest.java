package kr.co.kihd.date;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	

	public static void main(String[] args) {
		
		// Date 클래스는 TimeStamp기능으로 많이 사용된다.
		// 근태, 카드 사용내역, 로그 정보등
		Date today = new Date();
		// Date 클래스는 toString() 호출 하면 세계표준협정시(UTC) 형태로 출력이 됨.
		System.out.println(today);
		
		SimpleDateFormat simpleDateFormat = 
				new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh:mm:ss");
		System.out.println(simpleDateFormat.format(today));
		

	}

}
