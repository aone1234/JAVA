package kr.co.kihd.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class FileCopyTest {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fInputStream = new FileInputStream("C:\\workspace\\write3.txt");
		FileOutputStream fOutputStream = new FileOutputStream("C:\\workspace\\write3_본사본.txt");
		
		byte[] readBytes = new byte[1000];
		int data = 0;
		while ((data = fInputStream.read()) != -1) {
			fOutputStream.write(readBytes);
			System.out.println("읽은 바이트 수 : " + data);
			
		}
		fOutputStream.flush();
		System.out.println("C드라이브에 write3_본사본.txt 파일이 생성 되었습니다.");
		
		fOutputStream.close();
		fInputStream.close();
		
	}

}
