package kr.co.kihd.bufferedoutputstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedOutputstreamTest {
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\workspace\\Chap26(IO입출력2)\\src\\kr\\co\\kihd"
				              + "\\bufferedoutputstream"
				              + "\\Norway AMAZING Beautiful Nature with Relaxing "
				              + "Music and sound - 4k Ultra HD Quality.mp4");
		System.out.println("파일의 크기 : " + (file.length())/1024 + "Kbyte");
		System.out.println("파일의 크기 : " + ((file.length())/1024)/1024 + "Mbyte");
		
		// 주 스트림
		FileInputStream fInputStream = null;
		FileOutputStream fOutputStream = null;
		
		// 보조 스트림
		BufferedInputStream bInputStream = null;
		BufferedOutputStream bOutputStream = null;
		
		int dataCount = 0;
		long start = 0;
		long end = 0;
		byte[] bArr = new byte[10000];
		
		// 주 스트림에 보조 스트림을 연결함.(입력)
		fInputStream = new FileInputStream(file);
		bInputStream = new BufferedInputStream(fInputStream);
		
		// 주 스트림에 보조 스트림을 연결함.(출력)
		fOutputStream = new FileOutputStream("C:/Temp1/노르웨이 놀라운 아름다운 자연과 편안한 음악.mp4");
		bOutputStream = new BufferedOutputStream(fOutputStream);
		
		// 읽고 저장하기 전 시간 저장
		start = System.currentTimeMillis();
		
		// 1바이트씩 읽고 1바이트씩 저장하는 경우
		while((dataCount = bInputStream.read(bArr)) != -1) {
			   fOutputStream.write(bArr, 0, dataCount);
			
		}
		fOutputStream.flush();
		
		// 읽고 저장한 후 시간을 저장
		end = System.currentTimeMillis();
		
		System.out.println("BufferedOutputStream을 사용하지 않았을 때 : " + (end-start) + "ms");

		
		
		// 읽고 저장하기 전 시간 저장
		start = System.currentTimeMillis();
		
		while((dataCount = bInputStream.read(bArr)) != -1) {
 		       bOutputStream.write(bArr, 0, dataCount);
		
		}
		bOutputStream.flush();
	
		// 읽고 저장한 후 시간을 저장
		end = System.currentTimeMillis();
	
		System.out.println("BufferedOutputStream을 사용 했을 때 : " + (end-start) + "ms");
	
		
		// 자원 해제
		fOutputStream.close();
		bOutputStream.close();
		fInputStream.close();
		bInputStream.close();
		
	}

}








































