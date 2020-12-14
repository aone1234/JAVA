package kr.co.kihd.abstractt;

public abstract class Phone {
	
	private int serialNo;
	private String company;
	private String owner;
	
	// 추상 클래스
	public Phone(int serialNo, String company, String owner) {
		super();
		this.serialNo = serialNo;
		this.company = company;
		this.owner = owner;
	}

	public int getSerialNo() {
		return serialNo;
	}

	

	public String getCompany() {
		return company;
	}

	public String getOwner() {
		return owner;
	}
	
	// 추상 메세드 선언
	public abstract void turnOn();
	public abstract void turnOff();
	
	// 폰의 정보 표시 메서드
	public void showInfo() {
	    System.out.println("시리얼");
	}
	

}
