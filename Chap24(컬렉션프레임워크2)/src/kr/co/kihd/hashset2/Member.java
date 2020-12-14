package kr.co.kihd.hashset2;

import java.util.Objects;

public class Member {
	
	private String name;
	private int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	/*
	 * 논리적 동등 객체의 조건
	 *  1) 해쉬코드가 같아야 한다. (hashCode() 재정의 함.)
	 *  2) 두개의 객체들의 멤버 변수들의 값들이 같아야 한다.(equals() 재정의 함.) 
	 */
	
	/*
	 * hashCode() : 객체의 hashCode를 리턴함.
	 * 				각 객체의 주소값을 변환하여 생성함. 객체의 고유한 정수값.
	 * 				두 객체간의 동일 객체인지 비교 할때 사용 할 수 있음.
	 */
	
	@Override
	public int hashCode() {
		System.out.println("해쉬코드 호출");
		return Objects.hash(this.name, this.age);
	}
	
	// 하위 호환을 위해 해쉬코드 재정의 방법
//	@Override
//	public int hashCode() {
//		System.out.println("해쉬코드 호출");
//		return this.name.hashCode() + this.age;
//	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return (member.name.equals(this.name) && 
					(member.age == this.age));
		}
		else {
			return false;
			
		}
		
	}
	
	
}












































