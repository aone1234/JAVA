package kr.co.kihd.inputstream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

public class InputStreamReadTest01 {

	// 일반예외가 발생하는데 그 예외를 JVM에게 던지고 있음.
	public static void main(String[] args) throws Exception {
		
		// 다형성이 적용된 코드
		InputStream iStream = new FileInputStream("C:\\workspace\\test2.txt");
		int readByte;  		// 읽은 바이트수를 리턴 받는 변수
		
		// InputStream의 read()는 더이상 읽을 것이 없다면, -1을 리턴함.
		// 기본적으로 이클립스는 한글을 3바이트로 읽어 들인다. (UTF-8)
		// while((readByte = iStream.read()) != -1) {
		while(true ) {
			readByte = iStream.read();
			if(readByte == -1)
				break;
			
			// 아스키 코드값을 출력
			System.out.println("읽은 데이터 (1바이트) : " + readByte);
			// 강제 타입 캐스팅 후 문자로 출력
			System.out.println("읽은 문자 : " + (char)readByte);
			
		}
		// 이클립스의 디폴트 캐릭터셋
		System.out.println(Charset.defaultCharset());
		
		iStream.close();

	}

}
