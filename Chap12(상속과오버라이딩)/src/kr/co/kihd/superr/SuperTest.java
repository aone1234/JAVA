package kr.co.kihd.superr;

public class SuperTest {

	public static void main(String[] args) {
		
		// 자손 클래스의 인스턴스 생성,
		// 조상 클래스의 인스턴스 생성이 제일 먼저 이루어지고,
		// 자손 클래스의 인스턴스 생성되어 합쳐진 상태로 힙에 할당 된다.
		Child child = new Child();
		child.show();
		
		System.out.println();
		Parent parent = new Parent(1000);
		parent.show();
		
		System.out.println();
		Parent parent1 = new Child();			// 다형성
		parent1.show();
		
	}

}
