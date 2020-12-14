package kr.co.kihd.singleton;

import java.util.Calendar;
import java.util.Date;

public class UserTest
{

	public static void main(String[] args) 
	{
	   // User user1 = new User();   쓸 수 없음.
		User user1 = User.getInstance();
		User user2 = User.getInstance();
		
		System.out.println("User1의 주소 : " + user1);
		System.out.println("User2의 주소 : " + user2);
		
		// Object 클래스의 equals() : 주소 비교
		if(user1.equals(user2))
		// if(user1 == user2) -->  객체의 == 연산자 : 주소값 비교연산
		{
			System.out.println("같은 객체 입니다.");			
		}
		else 
		{
			System.out.println("다른 객체 입니다.");
		}
		
		/*
		 * 싱글톤 패턴을 사용 하는 이유 : 단, 하나의 인스턴스를 생성해서 서로 공유를 
		 * 						  원하고자 할때 사용
		 * ex) 사용자 환경설정, 커넥션 풀, 스레드풀, OS의 시간이나 날짜등.		 
		 */
		
		// Calendar calender = new Calendar();
		Calendar calender = Calendar.getInstance();
		Date date  = calender.getTime();
		 System.out.println(date);
	}
	
}
