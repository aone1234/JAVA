package kr.co.kihd.constructor2;

// 사람을 나타낸다.
public class Person {
	
	private String name;    // 이름
	private int age;        // 나이
	
	// 생성자 메소드
	// 이름만 초기화 하면서 새로운 Person 객체를 생성한다.
	public Person(String name) {
		this.setName(name);
		
	}
	
	// 나이만 초기화 하면서 새로운 Person 객체를 생성한다.
	public Person(int age) {
		this.setAge(age);
	}
	
	// 이름과 나이를 초기화 하면서 새로운 Person 객체를 생성한다.
	public Person(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}

	// 접근자 메소드(getter,setter)
	// 이름을 반환한다
	public String getName() {
		return name;
	}	
	
	// 나이를 반환한다
	public int getAge( ) {
		return age;
	}
	
	// 현 Person 객체의 정보에 대한 문자열을 반환한다.
	@Override
	public String toString() {
		return (name + "\t\t" + age);
	}
	
	// 변경자 메소드(setter)
	// 이름을 주어진 값으로 변경한다.
	public void setName(String name) {
	    this.name = name;	
	}
	// 나이를 주어진 값으로 변경한다.
	public void setAge(int age) {
		this.age = age;
	}
	
}
