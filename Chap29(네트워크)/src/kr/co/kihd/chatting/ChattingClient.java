package kr.co.kihd.chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChattingClient implements Runnable {
	
	String ip = "192.168.100.167";
	int port = 6060;
	Socket sk;
	
	public ChattingClient() {
		try {
			sk = new Socket(ip, port);
			System.out.println("채팅서버와 연결 되었습니다.");
			
			// 서버로 보낼 메세지를 키보드로 입력 받는 스트림 생성
			InputStreamReader inR = new InputStreamReader(System.in);
			BufferedReader bur = new BufferedReader(inR);
			
			// 서버로 보낼 메세지를 위한 스트림.
			PrintWriter pout = new PrintWriter(sk.getOutputStream(), true);
			
			Thread thread = new Thread(this);
			thread.start();
			
			String sendMsg = "";
			while((sendMsg = bur.readLine()) != null) {
				pout.println(sendMsg);
				
			}
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} // 생성자

	// 받는 메세지 처리는 스레드로 함
	
	public static void main(String[] args) {
		new ChattingClient();
	}

	// 받는 메세지 처리는 스레드로 함
	@Override
	public void run() {
		InputStream ins;
		
		try {
			ins = sk.getInputStream();
			BufferedReader buR = new BufferedReader(new InputStreamReader(ins));
		
			String svrMsg = "";
			while(true) {
				svrMsg = buR.readLine();
				System.out.println("Server > " + svrMsg);
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}































