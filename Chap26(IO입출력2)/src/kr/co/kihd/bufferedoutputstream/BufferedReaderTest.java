package kr.co.kihd.bufferedoutputstream;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderTest {

	public static void main(String[] args) throws Exception {
		
		// 주 스트림은 바이트 기반
		InputStream iStream = System.in;
		// 보조 스트림 첫번째는 바이트를 문자로 바꿔주는 InputStreamReader를 연결함.
		Reader reader = new InputStreamReader(iStream);
		// 보조 스트림 두번째는 속도 및 성능 향상을 해 주는 BufferedReader를 연결함.
		BufferedReader bReader = new BufferedReader(reader);
		
		System.out.println("입력 : ");
		
		// BufferedReader 보조 스트림은 readLine() 사용하기 위해 많이 사용됨.
		// readLine() : 한줄 단위 읽어들임
		String lineString = bReader.readLine();
		System.out.println("출력 : " + lineString);
		
		bReader.close();
		reader.close();
		iStream.close();
		
	}

}
