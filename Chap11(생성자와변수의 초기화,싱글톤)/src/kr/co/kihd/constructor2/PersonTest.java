package kr.co.kihd.constructor2;

// Person 객체를 만들어 사용한다.

public class PersonTest {

	public static void main(String[] args) {
		
		// 이름이 '추신수'인 Person 객체를 생성하고 person이 가리키게 한다.
		Person person = new Person("추신수");
		
		// person의 나이를 27로 변경한다.
		person.setAge(27);
		
		// person의 이름과 나이를 출력한다.
		System.out.println(person);
		
		// 나이가 18인 Person 객체를 생성하고 person2가 가리키게 한다.
		Person person2 = new Person(18);
		
		// person2의 이름을 '홍길동'으로 변경한다.
		person2.setName("홍길동");
		
		// person2의 이름과 나이를 출력한다.
		System.out.println(person2);
		
		// 이름이 '이순신'이고 나이가 20인 Person 객체를 생성하고 
		// person3이 가리키게 한다.
		Person person3 = new Person("이순신", 20);
		
		// person3의 이름과 나이를 출력한다.
		System.out.println(person3);

	}

}
