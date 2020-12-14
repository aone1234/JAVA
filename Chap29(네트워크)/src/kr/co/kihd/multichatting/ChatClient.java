package kr.co.kihd.multichatting;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class ChatClient extends JFrame implements Runnable, ActionListener {
	
	private JTextField input;
	private JTextArea output;
	private JButton send;
	private Socket socket;
	private BufferedReader br;
	private PrintWriter pw;
	
	public ChatClient() {
		
		input = new JTextField(15);
		
		output = new JTextArea();
		JScrollPane scroll = new JScrollPane(output);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);  // 스크롤바 항상 보이도록 설정.
		output.setEditable(false);
		
		send = new JButton("보내기");
		
		JPanel p = new JPanel(new BorderLayout());
		p.add("Center", input);
		p.add("East", send);
		
		Container c = this.getContentPane();
		c.add("Center", scroll);
		c.add("South", p);
		
		setBounds(500, 150, 500, 500);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				pw.println("exit");
				pw.flush();
				
			}
		});
				
	}
	
	// 클라이언트 객체 생성 후 바로 실행 되는 코드
	public void service() {
		// 서버IP
		String serverIP = 
		JOptionPane.showInputDialog(this, "서버 IP를 입력 하세요", "192.168.100.167");
		if(serverIP == null || serverIP.length() == 0) {
			System.out.println("서버 IP가 입력 되지 않았습니다. 서버 연결을 종료 합니다.");
			System.exit(0);
		}
		
		// 닉네임
		String nickName =
		JOptionPane.showInputDialog(this, "닉네임을 입력 하세요", "닉네임", JOptionPane.INFORMATION_MESSAGE);
		
		if(nickName == null || nickName.length() == 0) {
			nickName = "guest";
			
		}
		
		// 소켓생성....
		
	}
	
	public static void main(String[] args) {

		new ChatClient().service();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void run() {   // 스레드 처리
		
	}

}














































