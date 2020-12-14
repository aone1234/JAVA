package kr.co.kihd.modifier3;

public class Defence extends Player {

	private int defence;
		
	public Defence(String name, int age, int backNumber, int speed, int defence) {
		super(name, age, backNumber, speed);
		this.defence = defence;
			
		
	}
	
	public int getdefence() {
		return this.defence;
		
	}
	
	
	@Override
	public void info() {
		super.info(); 			// player의 info를 호출
		System.out.println("유효 슈팅 : " + this.getdefence());
		
	}

}
