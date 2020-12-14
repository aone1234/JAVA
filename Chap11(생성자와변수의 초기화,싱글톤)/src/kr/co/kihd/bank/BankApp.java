package kr.co.kihd.bank;

import java.util.Scanner;

public class BankApp {

	// 배열 100개 정적멤버로 되어있고, 배열이므로 한계가 있다.(메모리낭비, 정적이다)
	private static Account[] accountArray = new Account[100];
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금하기 | 4. 출금하기 | 5. 종료하기");
			System.out.println("------------------------------------------------------");
			System.out.println("선택> ");
			
			int choice = scan.nextInt();
			
			if(choice == 1 ) {
				createAccount();
			}
			else if(choice == 2) {
				accountList();
			}
			else if(choice == 3) {
				deposite();
			}
			else if(choice == 4) {
				withdraw();
			}
			else if(choice == 5) {
				System.out.println("계좌관리 프로그램을 종료합니다.");
				run = false;
			}else {
				System.out.println("잘못 입력 되었습니다.");
			}
		}

	}
	
	// 출금하기
	public static void withdraw() {
		System.out.println("------------");
		System.out.println("출금을 합니다.");
		System.out.println("------------");
		
		System.out.println("계좌번호를 입력 : ");
		String ano = scan.next();
		System.out.println("출금액 : ");
		int money = scan.nextInt();
		
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("결과 : 계좌가 없습니다. 확인 바랍니다.");
			return;
			
		}
		
		account.setBalance(account.getBalance() - money);
		System.out.println("결과 : 출금이 성공했습니다. 현재 잔액 : " +
							account.getBalance()); 
		
	}

		
	

	// 예금하기
	public static void deposite() {
		System.out.println("------------");
		System.out.println("예금을 합니다.");
		System.out.println("------------");
		
		System.out.println("계좌번호를 입력 : ");
		String ano = scan.next();
		System.out.println("예금액 : ");
		int money = scan.nextInt();
		
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("결과 : 계좌가 없습니다. 확인 바랍니다.");
			return;
			
		}
		
		account.setBalance(account.getBalance() + money);
		System.out.println("결과 : 예금이 성공했습니다. 현재 잔액 : " +
							account.getBalance()); 
		
	}

	// 계좌 찾기
	public static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				
				// 매개변수로 넘어온 계좌번호와 동일하다면
				if(accountArray[i].getAon().equals(ano)) {
					account = accountArray[i];
				}
				
			}
			
		}
		
		return account;
		
		
	}

	// 계좌 목록 출력하기
	public static void accountList() {
		System.out.println("----------------");
		System.out.println("계좌목록을 출력합니다.");
		System.out.println("----------------");
		
		for(int i=0; i<accountArray.length; i++) {
			Account account = accountArray[i];
			
			// 계좌에 대한 내용이 존재하면
			if(account != null) {
				System.out.print(account.getAon());
				System.out.print("\t");
				System.out.print(account.getOwner());
				System.out.print("\t");
				System.out.print(account.getBalance());
				System.out.println();
				
			}
		}
		
	}
	
	public static void createAccount() {
		System.out.println("-------------");
		System.out.println("계좌를 생성합니다.");
		System.out.println("-------------");
		
		System.out.print("계좌 번호 : ");
		
		// next() : 한단어를 입력 받을 때 용이한 메서드 (공백을 발견하면  그 앞까지만 String 리턴)
		// nextLine() : 한문장이나 한줄을 입력 받을 때 용이한 메서드
		String ano = scan.next();
		
		System.out.print("계좌주 : ");
		String owner = scan.next();
		
		System.out.print("초기 입금액 : ");
		int balance = scan.nextInt();
			
		Account newAccount = new Account(ano, owner, balance);
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과 : 계좌 생성 완료되었습니다.");
//				System.out.println(accountArray[i].getAon() + ", " + 
//									accountArray[i].getOwner() + ", " +
//									accountArray[i].getBalance());
				break;
				
			}
			
		}
		
	}

}
