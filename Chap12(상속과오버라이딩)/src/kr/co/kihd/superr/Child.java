package kr.co.kihd.superr;

public class Child extends Parent {
	
	int x = 20;
	
	public Child() {
		// super() : 조상클래스의 기본 생성자를 호출, 
		// (기본 생성자에 한해서만) 생략 하더라도 컴파일러가 알아서 추가함.
		// 조상 클래스의 매개변수가 있는 생성자를 호출시에는 생략을 절대로 하면 안됨.
		// => 조상 클래스가 먼저 만들어져야 하기 때문임.
		super(200);
		
		System.out.println("자손 클래스 생성자 호출");
		
	}
	
	public void show() {
		System.out.println("현재 인스턴스의 x = " + x);
		System.out.println("자손 클래스의 this.x = " + this.x);
		System.out.println("조상 클래스의 super.x = " + super.x);
		super.show();
		
	}

}
