package kr.co.kihd.nested;

import kr.co.kihd.nested.A.C;

public class ATest {
	
	public static void main(String[] args) {
		A a = new A();
		// 인스턴스 클래스인 B는 반드시 외부 클래스 A의 인스턴스가 있어야 생성 가능 하다.
		A.B b = a.new B();
		b.method1();
		System.out.println("====================================");
		
		
		System.out.println(A.C.c);
		A.C.method2();
		// 정적 멤버 클래스인 C는 외부 클래스 A의 인스턴스가 있던 없던 상관없이 접근 가능하다.
		
		
		C c = new C();
		System.out.println(c.c);
		System.out.println(C.c);
		c.method1();
		c.method2();
		
		
		
	}

}
