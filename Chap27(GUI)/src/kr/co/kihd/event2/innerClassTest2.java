package kr.co.kihd.event2;

import kr.co.kihd.event2.Outer1.Inner;

public class innerClassTest2 {

	public static void main(String[] args) {
		Outer1 ot1 = new Outer1();
		Outer1.Inner oi = ot1.new Inner();
		oi.InnerFunc();
		
		
	}

}

class Outer1 {
	int value = 100;
	
	class Inner {
		int value = 200;
		
		void InnerFunc() {
			int value = 300;
			System.out.println("InnerFunc의 value : " + value);
			System.out.println("Inner클래스의 value : " + this.value);
			System.out.println("Outer1클래스의 value : " + Outer1.this.value);
	
			
		}
		
	} 		// Inner Class
	
}  		    // Outer1 Class
