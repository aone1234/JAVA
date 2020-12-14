package kr.co.kihd.nested;

public class NestedTest {
	
	// 인스턴스 멤버 클래스
	class A {
		int iv = 100;
		// static int cv = 200; 		// static 멤버변수는 사용불가.
		
		public A() {
			System.out.println("A 생성자 호출");

			
		}
		
		public void method() {
			System.out.println("A클래스의 method() 호출");
		}
		
//		public static void method2() {
//			
//			
//		}
		
				
	}
	
	public static void main(String[] args) {
		NestedTest nestedTest = new NestedTest();
		// 인스턴스 멤버 클래스는 외부 클래스의 인스턴스가 반드시 있어야 생성 가능함.
		NestedTest.A a = nestedTest.new A();
		System.out.println(a.iv);
		a.method();
		System.out.println("===================================");
		
		// 정적 클래스 : 외부클래스의 인스턴스가 없이도 접근 가능함.
		System.out.println(NestedTest.B.cv);
		NestedTest.B.method2();
		System.out.println("===================================");
		
		nestedTest.method1();
		System.out.println("===================================");
		nestedTest.method2();
		
	}
	
			// 정적 멤버 클래스
			static class B {
				int iv = 100;
				static int cv = 500; 		// NestedTest.B.cv 접근가능
				
				public B() {
					System.out.println("B 생성자 호출");
					
				}
				
				public static void method2() {
					System.out.println("B클래스의 method() 호출");
				}
						
			}
				
		public void method1() {
			// 로컬 클래스 : 메서드내에 선언과 사용(잠깐 사용할 용도)
			class C {
				int iv = 200;
				// static cv = 700;		// static 멤버 선언 불가
				public C() {
					System.out.println("로컬 클래스C 생성자 호출");
					
				}
				
				public void lmethod() {
					System.out.println("로컬 클래스C 메서드 호출");
				}
				
			}
			// 로컬 클래스는 해당 메서드 내에서만 사용이 가능하다 것에 주목하자.
			C c = new C();
			System.out.println(c.iv);
			c.lmethod();
						
		}
			
		public void method2() {
			// 로컬 클래스 : 메서드내에 선언과 사용(잠깐 사용할 용도)
			class D {
				int iv = 200;
				// static cv = 700;		// static 멤버 선언 불가
				public D() {
					System.out.println("로컬 클래스D 생성자 호출");
					
				}
				
				public void lmethod() {
					System.out.println("로컬 클래스D 메서드 호출");
				}
				
			}
			// 로컬 클래스는 해당 메서드 내에서만 사용이 가능하다 것에 주목하자.
			D d = new D();
			System.out.println(d.iv);
			d.lmethod();
						
		}
		
}
