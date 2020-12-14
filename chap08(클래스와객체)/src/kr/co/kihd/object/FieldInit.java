package kr.co.kihd.object;

public class FieldInit {

	
	// 기본형 변수
	byte byteField;          	// 1 byte
	short shortField;        	// 2 byte
	int intField;           	// 4 byte (디폴트 타입)
	long longField;				// 8 byte
	
	boolean booleanField;       // 1 byte
	char charField;				// 2 byte
	
	
	float floatField;	        // 4 byte
	double doubleField;			// 8 byte
	
	
	// 참조형 변수
 	int[]  arrField; 			// 4 byte
	String strField;			// 4 byte

 	// this : 객체자기자신의 주소
 	// super : 조상객체의 주소
	
	// toString[] : 클래스의 멤버변수(필드)의 값들을 수시로 확인하고자 할때나, 
	// 원하는 포멧으로 멤버 변수들을 출력하고자 할때 많이 사용함.
 	@Override
 	public String toString() {
 		String str = "byteField : " + byteField + ", shortField : " + shortField +
 				     ", intField : " + intField + "longField : " + longField +
 				     ", booleanField : " + booleanField + ", strField : " + strField;
 		return str;
 	  
 		
 	}
 	

}


