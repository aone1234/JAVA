package kr.co.kihd.decision;

public class If_If_elseTest {

	public static void main(String[] args) {
		
		int score = 99;
		
		//몇 수십개의 if문이 존재하더라도, CPU는 모든 if문을 참조합니다.(비효율적)
		if(score > 90) {
		   System.out.println("점수가 90보다 큽니다.");
		}
		
		
		if(score > 80) {
			   System.out.println("점수가 80보다 큽니다.");
		}
		
		
		if(score > 92) {
			   System.out.println("점수가 92보다 큽니다.");
		}
			
        System.out.println("==========================");
        
        //if-else 구문은 50%확률일때 사용하는게
        
        if(score > 90) {
 		   System.out.println("점수가 90보다 큽니다.");
        }
        else {
        	System.out.println("점수가 90점미만 입니다.");
        }
		
	}

}
