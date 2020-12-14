package kr.co.kihd.component;

import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ActionBtnTest extends Frame 
						    implements ActionListener, WindowListener {
	
	Button btn1, btn2, btn3;
	
	public ActionBtnTest() {
		setLayout(new FlowLayout());
		setBounds(200, 200, 300, 300);
		
		btn1 = new Button("Red");
		btn2 = new Button("Green");
		btn3 = new Button("Blue");
		
		add(btn1); add(btn2); add(btn3);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		addWindowListener(this);
		
	}
	
	
	public static void main(String[] args) {
	
		ActionBtnTest ab = new ActionBtnTest();
		ab.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();   // 버튼의 문자열을 반환함.
		if(str.equals("Red")) {
			this.setBackground(Color.red);
		}
		else if(str.equals("Green")) {
			this.setBackground(Color.green);
			
		}		
		else if(str.equals("Blue")) {
			setBackground(Color.blue);
		}
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
