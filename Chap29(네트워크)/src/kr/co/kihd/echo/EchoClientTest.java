package kr.co.kihd.echo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClientTest {
	
	public static void main(String[] args) throws Exception {
		
		String ip = "192.168.100.167";
		int port = 7070;
		
		Socket socket = new Socket(ip, port);
		System.out.println("서버와 접속이 되었습니다!!");
		
		// 서버로부터 데이터를 입력 받는 스트림
		InputStream ins = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(ins);
		BufferedReader bff = new BufferedReader(isr);
		
		OutputStream ous = socket.getOutputStream();
		PrintWriter pout = new PrintWriter(ous, true);
		
		// 키보드로부터 데이터를 입력 받는 스트림
		InputStreamReader inR = new InputStreamReader(System.in);
		BufferedReader pout2 = new BufferedReader(inR);
		
		String serverMsg = "", sendMsg = "";
		serverMsg = bff.readLine();
		System.out.println("서버 메세지 > " + serverMsg);
		
		while((sendMsg=pout2.readLine()) != null) {
			pout.println(serverMsg);
			
			serverMsg = bff.readLine();
			System.out.println("서버 메세지 > " + serverMsg);
		}
		
		
		bff.close(); socket.close(); isr.close(); ins.close();
		
	}
	
}
