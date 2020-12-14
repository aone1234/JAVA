package kr.co.kihd.inheritancereview;

class Shape {
	public Shape next;
	public Shape() {
		this.next = null;
		
	}
	public void draw() {
		System.out.println("Shape");
	}
	
}

class Line extends Shape {
	
	@Override
	public void draw() {
		System.out.println("Line");
		
	}
	
}

class Rect extends Shape {
	
	@Override
	public void draw() {
		System.out.println("Rect");
		
	}
	
}

class Circle extends Shape {
	
	@Override
	public void draw() {
		System.out.println("Circle");
		
	}
	
}

public class MethodOverriding {
	static void paint(Shape shape) {		// Shape을 상속 받은 모든 객체들이 매개변수 shape로 넘어 올수 있음.
		shape.draw();		  				// Shape가 가리키는 객체 내에 오버라이딩 한 draw() 호출. (동적 바인딩)
		
	}

	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Rect());
		paint(new Circle());
		
	}

}






