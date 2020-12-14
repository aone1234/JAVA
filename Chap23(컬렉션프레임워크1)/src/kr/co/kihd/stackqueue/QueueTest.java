package kr.co.kihd.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		
		Queue<Message> mQueue = new LinkedList<>();
		
		mQueue.offer(new Message("sendMail", "최지만"));
		mQueue.offer(new Message("sendSMS", "류현진"));
		mQueue.offer(new Message("sendKaKatalk", "추신수"));
		mQueue.offer(new Message("sendFaceBook", "박찬호"));
		
		while(!mQueue.isEmpty()) {
			Message message = mQueue.poll();
			
			switch(message.getCommand()) {
			case "sendMail" :
				System.out.println(message.getTo() + "에게 메일을 보냅니다.");
				break;
				
			case "sendSMS" :
				System.out.println(message.getTo() + "에게 SMS를 보냅니다.");
				break;
			
			case "sendKaKatalk" :
				System.out.println(message.getTo() + "에게 카카오톡을 보냅니다.");
				break;
			
			case "sendFaceBook" :
				System.out.println(message.getTo() + "에게 FaceBook을 보냅니다.");
				break;
				
			}
			
		}
		
	}

}




























