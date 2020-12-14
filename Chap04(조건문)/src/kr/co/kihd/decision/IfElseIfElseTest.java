package kr.co.kihd.decision;

import java.util.Scanner;

public class IfElseIfElseTest {

	public static void main(String[] args) {
		
	  //Resource이기 때문에 닫아줘야함.	
	  Scanner scan = new Scanner(System.in);
	  
	  System.out.print("점수를 입력하세요 : ");
	  int score = scan.nextInt();
	  
	  if(score >= 90) {
		  System.out.println("점수가 90~100점 사이 입니다.");
		  System.out.println("등급은 A입니다.");
	  }
	  else if(score >= 80) {
		  System.out.println("점수가 80~89점 사이 입니다.");
		  System.out.println("등급은 B입니다.");
	  }
	  
	  else if(score >= 70) {
		  System.out.println("점수가 70~79점 사이 입니다.");
		  System.out.println("등급은 C입니다.");
	  }
	  else {
		  System.out.println("점수가 70점 미만 입니다.");
		  System.out.println("등급은 D입니다.");
		  
		  
	  }
	  
	  
	  scan.close();

	}

}
