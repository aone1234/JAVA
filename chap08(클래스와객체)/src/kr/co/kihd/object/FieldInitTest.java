package kr.co.kihd.object;

public class FieldInitTest {

	public static void main(String[] args) {
		
		
		// 붕어빵을 찍고 있다.
		// 제품을 생산하고 있다.
		
		// new 연산자 : 클래스에 있는 멤버들의 바이트 크기만큼
		// 힙에다가 메모리 할달을 하여 동시에 초기화를 시켜주는 역할을 함.
		FieldInit field = new FieldInit();
		System.out.println(field.byteField);
		System.out.println(field.booleanField);
		System.out.println(field.floatField);
		
		
		System.out.println(field);
		System.out.println(field.toString());
		
		

	}

}
