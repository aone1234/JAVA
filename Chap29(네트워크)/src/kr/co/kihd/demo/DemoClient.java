package kr.co.kihd.demo;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class DemoClient {

	public static void main(String[] args) throws Exception {
		
		// 연결시에 소켓이 생성된다. 연결이 안될 경우에는 예외 발생 한다.
		Socket socket = new Socket("192.168.100.167", 5050);	// 127.0.0.1
		System.out.println("서버와 접속이 되었습니다. ~ ~ ");
		
		InputStream ins = socket.getInputStream();
		DataInputStream dins = new DataInputStream(ins);
		
		String str = dins.readUTF();
		int number = dins.readInt();
		System.out.println("서버에서 전송된 문자 : " + str );
		System.out.println("서버에서 전송된 값 : " + number );
		
		dins.close(); ins.close(); socket.close();
		
		
	}

}
