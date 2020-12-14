package kr.co.kihd.inheritancereview;

class A {
	public A() {
		// super();
		System.out.println("생성자 A");
		
	}
	
}

class B extends A {
	public B() {
		// super();
		System.out.println("생성자 B");
		
	}
	
}

class C extends B {
	public C() {
		// super();
		System.out.println("생성자 C");
		
	}
	
}

public class ConstructorEx {

	public static void main(String[] args) {
		C c = new C();

	}

}









