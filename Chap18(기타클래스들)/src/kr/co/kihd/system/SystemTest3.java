package kr.co.kihd.system;

import java.util.Properties;
import java.util.Set;

public class SystemTest3 {
	
	public static void main(String[] args) {
		
		String osName = System.getProperty("os.name");
		System.out.println("현재 운영체제 : " + osName);
		
		String userName = System.getProperty("user.name");
		System.out.println("사용자 계정 : " + userName);
		
		// Properties 클래스는 Map계열의 컬렉션이다.
		// Key도 String, 값도 String 갖는다
		Properties properties = System.getProperties();
		// Map 컬렉션에서 키값만 Set계열로 가져오는 메서드가 keyset()임.
		Set set = properties.keySet();
		System.out.println("key                   value");
		System.out.println("===========================");
		for(Object objkey : set) {
			String key = (String) objkey;
			String value = System.getProperty(key);
			System.out.println(key + "                 " + value);
		}
		
	}

}
