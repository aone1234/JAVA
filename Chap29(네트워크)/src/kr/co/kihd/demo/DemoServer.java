package kr.co.kihd.demo;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class DemoServer {

	public static void main(String[] args) throws IOException {
		
		int port = 5050;
		int number = Integer.parseInt(args[0]);
		String str = new String(args[1]);
		
		// 서버 소켓 생성
		ServerSocket serverSocket= new ServerSocket(port);
		System.out.println("접속 대기중 ~ ");
		
		while(true) {
			Socket socket = serverSocket.accept();
			System.out.println("사용자 접속 했습니다..");
			System.out.println("클라이언트 IP : " 
			            + socket.getInetAddress().getHostAddress());
			
			// 스트림 생성
			OutputStream ous = socket.getOutputStream();
			DataOutputStream dous = new DataOutputStream(ous);
			
			dous.writeUTF(str);
			dous.writeInt(number);
			dous.flush();
			
			dous.close();
			ous.close();
			socket.close();
			
			
		}
		
	}

}




































