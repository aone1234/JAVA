package kr.co.kihd.event2;

public class innerClassTest {
	
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		System.out.println("Outer의 aa값 : " + outer.aa);
		System.out.println("Outer의 bb값 : " + Outer.bb);
		outer.method();
		
		System.out.println("------- Inner 클래스 접급하기 -------");
		Outer outer2 = new Outer();
		Outer.Inner inner = outer2.new Inner();
		System.out.println("Inner의 cc 값 = " + inner.cc);
		inner.subFunc();
		
		Outer.StaictInner staictInner = new Outer.StaictInner();
		System.out.println("StaictInner의 dd값 = " + staictInner.dd);
		staictInner.subFunc1();
		// staictInner.subFunc2();
		Outer.StaictInner.subFunc2();
		
	}

}


class Outer {
	
	int aa = 100;			  // 인스턴스 변수, non-static 변수
	static int bb = 200;      // 클래스 변수, static 변수
	
	public void method() {
		System.out.println("------- 일반 메소드 -------");
	}
	
	// Member Inner 클래스 (non-static 내부 클래스)
	class Inner {			  
		int cc = 10;
		public void subFunc() {
			System.out.println("------- Inner Class(non-static) -------");
			System.out.println("외부 클래스의 변수 aa = " + aa);
			System.out.println("외부 클래스의 변수 bb = " + bb);
			method();
			
		}
	}
	
	static class StaictInner {
		int dd = 20;
		static int ee = 30;
		
		public void subFunc1() {
			System.out.println("------- Inner Class(static1)");
		}
		
		public static void subFunc2() {
			System.out.println("------- Inner Class(static2)");
		}
		
	}
	
}

































