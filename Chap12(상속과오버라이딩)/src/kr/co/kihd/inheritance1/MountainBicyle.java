package kr.co.kihd.inheritance1;

/*
 * 상속을 하는 이유
 *  1) 공통된 코드는 조상에서 관리
 *  2) 개별적인 부분은 자속에서 따로 관리
 *  3) 코드의 재사용성 
 */


// 상속은 직접적 관계에 있는 자식 클래스
public class MountainBicyle extends Bicycle {
	
	// 멤버개수 : 5개
	String frame;
	int gear;
	int price;
	String sector;
	
	public void print() {
		System.out.println("ID : " + this.id);
		System.out.println("BRAND : " + this.brand);
		System.out.println("FRAME : " + this.frame);
		System.out.println("GEAR : " + this.gear);
		System.out.println("PRICE : " + this.price);
		System.out.println("OWNER : " + this.owner);
		
	}
	
	public static void main(String[] args) {
		
		MountainBicyle mountainBicyle = new MountainBicyle();
		mountainBicyle.id = 1111;
		mountainBicyle.brand = "Black Cats";
		mountainBicyle.frame = "알루미늄";
		mountainBicyle.gear = 33;
		mountainBicyle.price = 300000;
		
		mountainBicyle.print();
		
	}

}
