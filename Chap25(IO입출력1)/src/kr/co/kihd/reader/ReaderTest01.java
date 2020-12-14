package kr.co.kihd.reader;

import java.io.FileReader;
import java.io.Reader;

public class ReaderTest01 {

	public static void main(String[] args) throws Exception {
		
		// Reader 클래스는 문자 특화 클래스 하위 클래스인 FileReader을 생성해서 대입
		Reader reader = new FileReader("C:\\workspace\\test5.txt");
		int readData;
		
		// readData는 int 값으로 끝 2바이트(문자 2바이트이니까)에 저장 된다.
		while((readData = reader.read()) != -1) {
			
			// 문자출력(바이트 정보를 강제로 캐스팅)
			System.out.println("읽은 문자 : " + (char)readData);
			
			// 영문자는 아스키 코드가 출력이 되고, 한글은 유니코드가 출력.
			// System.out.println("읽은 문자 : " + readData);
		}
	
//		while(true) {
//			readData = reader.read();
//			if(readData == -1)
//				break;
//							
//		}
		reader.close();
		
	}

}
