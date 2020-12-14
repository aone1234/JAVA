package kr.co.kihd.bank;

public class Account {

	private String aon;                    // 계좌번호
	private String owner;                  // 계좌주
	private int balance;                   // 잔 액
	
	// 매개변수가 있는 생성자
	public Account(String aon, String owner, int balance) {
		super();
		this.aon = aon;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAon() {
		return aon;
	}

	public void setAon(String aon) {
		this.aon = aon;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
