package kr.co.kihd.classs;

public class ClassTest {
	
	public static void main(String[] args) {
		// 객체로 부터 클래스 정보를 얻는 방법(getClass())
		Person person = new Person();
		Class class1 = person.getClass();
		
		System.out.println(class1.getName());
		System.out.println(class1.getSimpleName());
		
		System.out.println();
			
		
	// 2) 문자열로 부터 객체의 정보를 얻는 방법(Class.forName())
	try {
		Class class2 = Class.forName("kr.co.kihd.classs.Person");
		System.out.println(class2.getName());
		System.out.println(class2.getSimpleName());
		
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}

	}

}