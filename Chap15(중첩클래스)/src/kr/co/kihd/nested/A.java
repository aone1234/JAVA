package kr.co.kihd.nested;

public class A {
	
	public A() {
		System.out.println("=================================");
		System.out.println("외부 클래스 A의 생성자 호출");
		
		B b = new B();    // 인스턴스 멤버 클래스는 외부 클래스 A의 멤버이다.
		System.out.println(b.a);
		b.method1();
		
		C c = new C();
		System.out.println(c.a);
		
		c.method1();
		C.method2();
				
	}
	
	// 인스턴스 멤버 클래스 B
	class B {
		int a = 10;
		// static int cv = 20; 	 
		
		public B() {
			System.out.println("중첩 클래스 B의 생성자 호출");
		}
		
		public void method1() {
			System.out.println("B클래스 멤버 메서드 호출");
		}
		
		//static void method2() {}
		
	}
	
	// 정적 멤버 클래스 C
	
	static class C {
	
	
		int a = 10;
		static int c = 200;
		
		public C() {
			System.out.println("정적 멤버 클래스 C의 생성자 호출");
			
		}
		
		public void method1() {
			System.out.println("정적 멤버 클래스 C의 method1() 호출");
			
		}
	
		public static void method2() {
		 
			System.out.println(" 정정");
		}

	}
}
