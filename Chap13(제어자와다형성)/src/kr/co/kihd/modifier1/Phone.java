package kr.co.kihd.modifier1;

public class Phone {
	
	// 필드(멤버변수), 외부에서부터 접근 못하게 막는다.
	protected String model;
	private String color;
	private String company;
	
	public Phone() {
		
	
	}

	// 매개변수가 있는 생성자
	public Phone(String model, String color, String company) {
		super();
		this.model = model;
		this.color = color;
		this.company = company;
	}

	// getter() 제공
	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public String getCompany() {
		return company;
	}
	
	@Override
	public String toString() {
		String str = "모  델 : " + this.getModel() + 
				     ", 색  상 : " + this.getColor() +
				     ", 제조회사 : "+ this.getCompany();
		
		return str;
		
	}
	
}
