package kr.co.kihd.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamTest02 {

	public static void main(String[] args) throws Exception {
		
		// 파일로 부터 출력 스트림을 생성해서 대입하고 있다.
		OutputStream oStream = new FileOutputStream("C:\\workspace\\write2.txt");
		
		// "KOREA대한민국" 문자열을 통해서 바이트 배열을 얻고 있다. (인코딩)		
		byte[] data = "KOREA 대한민국".getBytes();
		// getBytes()를 사용할때, 매개변수의 값으로 캐릭터셋을 줄 수가 있는데
		// EUC-KR, x-windows-949은 한글을 2바이트 인식,
		// UTF-8은 한글을 3바이트로 인식한다.
		// ISO8859-1
		System.out.println("data 바이트 배열의 크기 : " + data.length);
		
		// 바이트 배열을 한번에 스트림에 보낸다.
		// 이 앞에서 본 write(int b)메서드 비해서 훨씬 효율적 이다.
		oStream.write(data);
		System.out.println("저장이 완료 되었습니다.");
		oStream.flush();
		
		System.out.println();
		// 출력으로 내보낸 파일인 write2.txt 파일을 읽어 들인다.
		InputStream iStream = new FileInputStream("C:\\workspace\\write2.txt");
		int count = 0;
		
		// UTF-8이 한글이 3바이트 이므로 바이트 배열을 3바이트 생성함.
		byte[] readBytes = new byte[3];
		int i = 0;
		
		while ((count = iStream.read(readBytes)) != -1) {
			i++;
			String str = new String(readBytes);      // 디코딩
			System.out.println("읽은 값 : " + str);
			System.out.println("읽은 바이트 수 : " + count);
			
		}
		System.out.println("루핑 수 : " + i);
				
		iStream.close();
		oStream.close();
		
	}

}




































