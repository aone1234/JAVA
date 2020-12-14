package kr.co.kihd.bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class BufferedInputStreamTest {
	
	public static void main(String[] args) throws Exception {
		
		long start = 0;
		long end = 0;
		File file = new File("C:\\workspace\\Chap26(IO입출력2)\\src\\kr\\co\\kihd"
				              + "\\bufferedinputstream\\We Never Go Alone.mp4");
					
		// 바이트 기반으로 속도의 차이를 보기 위한 프로그램을 작성 해 본다.
		FileInputStream fStream = new FileInputStream(file);
		System.out.println("File의 크기 : " + file.length());
		
		System.out.println("바이트 기반 읽기 시작");
		start = System.currentTimeMillis();
		// 그냥 일기만 한다.
		while(fStream.read() != -1) {}
		System.out.println("바이트 기반 읽기 끝");
		end = System.currentTimeMillis();
		System.out.println("버퍼를 사용하지 않았을 때 (바이트 기반)" + (end-start) + "ms");
		
		fStream.close();
		
		System.out.println();
		
		/*
		 * 주 입력 스트림인 FileInputStream에다가 속도 및 성능 향상 보조 스트림인  
		 * BufferedInputStream을 연결 한다.
		 * 실질적으로 file을 읽어오는 스트림은 바로 주 스트림이고, 읽어온 데이터를 빨리 
		 * 처리해 주는 역할을 하는 것이 바로 보조 스트림인 BufferedInputStream 이다.
		 */
				
		FileInputStream fStream2 = new FileInputStream(file);
		BufferedInputStream bStream = new BufferedInputStream(fStream2);
		
		System.out.println("버퍼 기반 읽기 시작");
		start = System.currentTimeMillis();
		
		while(bStream.read() != -1) {
			
			System.out.println("바이트 기반 읽기 끝");
			end = System.currentTimeMillis();
			
			System.out.println("버퍼를 사용 했을때 (버퍼기반)" + (end-start) + "ms");
			
			bStream.close();
			fStream.close();
			
		}
		
	}

}


































