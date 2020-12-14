package kr.co.kihd.hashset2;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<Member> set = new HashSet<>();
		
		/*
		 * new를 사용했기 때문에, 아래에 4개의 Member 객체는 서로 다른 주소를 
		 * 가지고 있다. 하지만, Member 클래스에서 hashCode()를 재정의 했기에
		 * 동등객체로 인식한다. 즉 Set은 중복저장을 하지 않는다. 
		 */
		
		set.add(new Member("최지만", 30));
		set.add(new Member("최지만", 30));
		set.add(new Member("최지만", 25));
		set.add(new Member("최지만", 17));
		
		System.out.println("총 객체수 :" + set.size());
		
		// 반복자
		Iterator<Member> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			Member member = iterator.next();		
			System.out.println(member.getName() + " : " + 
							    member.getAge());
			
		}
		
	}

}


































