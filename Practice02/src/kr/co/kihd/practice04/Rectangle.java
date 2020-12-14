package kr.co.kihd.practice04;

public class Rectangle {
	
	private int x;
	private int y;
	private int width;
	private int height;
	
	

	public Rectangle(int x, int y, int weight, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int square() {
		return width * height;
	}

	public void show() {
		System.out.println("(" + x + "," + y + ")에서 ");
		System.out.println("크기가" + width + "X" + height + "인 사각형");
			
	}
	
	public boolean contains(Rectangle rectangle) {
		if(x < rectangle.x && y < rectangle.y 
				&& x + width > rectangle.x + rectangle.width
				&& y + height > rectangle.y + rectangle.height)
			return true;
		else
			return false;
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
