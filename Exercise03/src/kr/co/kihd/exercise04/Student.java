package kr.co.kihd.exercise04;

// 학생을 나타내는 클래스
public class Student {
	
	// 객체 변수들
	
	private int studentNumber;          // 학번
	private String name;    			// 이름
	
	private int testScore1;   			   // 시험점수1
	private int testScore2;   			   // 시험점수2 
	private int testScore3;   			   // 시험점수3
	
	// 생성자(메소드)
    public Student(int number, String studentName, 
    		        int score1, int score2, int score3) 
    {
	
    	this.studentNumber = number;
    	this.name = studentName;
    	this.testScore1 = score1;
    	this.testScore2 = score2;
    	this.testScore3 = score3;
    }
	
	// 메소드1(setScore) : 시험번호(1~3사이), 시험점수를 받아서 
	//                   해당 변수의 값을 변경함.
	public void setScore(int testNumber, int score) 
	{
		switch (testNumber) 
		{
			case 1:
				testScore1 = score;
				break;
			case 2:
				testScore2 = score;				
				break;	
			case 3:
				testScore3 = score;				
			default:
				System.out.println("시험번호는 1부터 3사이의 정수 입니다.");
				break;
		}
	}
        
	// 메소드2(getScore) : 시험번호를 매개변수로 받아서 그 번호에 해당되는 
	//      			 시험점수를 반환함.
	public int getScore(int testnumber) {
		
		switch(testnumber) {
		case 1:
			return testScore1;
		case 2:
			return testScore2;
		case 3:
			return testScore3;
		default:
			System.out.println("시험번호는 1부터 3사이의 정수여야함.");
			return -1;
			
		}
		
	}
		
	
	
	// 메소드3(getAverage) : 세개의 시험 점수들의 평균을 구하여 반환함
	public double getAverage() {
	
		return (testScore1 + testScore2 + testScore3) / 3.0;
		
	}	

	public String toString() {
	   String str = "학번 : \t" + studentNumber + "\n";	
	   str += "이름 : \t" + name + "\n";
	   str += "시험점수 1 : \t" + testScore1 + "\n";
	   str += "시험점수 2 : \t" + testScore2 + "\n";
	   str += "시험점수 3 : \t" + testScore3 + "\n";
	   str += "학번 : \t" + getAverage() + "\n";
	   
	   return str;
	}
	
}
	
	// toString 메소드
	// 학번, 이름, 시험점수, 시험평균 점수를 반환함.
	

