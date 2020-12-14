package kr.co.kihd.staticnonstatic;

public class PersonTest {

	public static void main(String[] args) {

		Persion person = new Persion(50);
		// final 속성은 상수 이므로 값을 변경 절대 못함.
		// person.NATION = "USA";			// 불가함 확인
		// person.age = 60;			    	// 불가함 확인
		System.out.println(person);
		System.out.println(Persion.MAX_NUMBER);
		
		Persion person1 = new Persion(150);
		Persion person2 = new Persion(250);
		System.out.println(person);
		System.out.println(person1);
		System.out.println(person2);
		
		System.out.println(person.age);
		System.out.println(person1.age);
		System.out.println(person2.age);
		
	}

}
