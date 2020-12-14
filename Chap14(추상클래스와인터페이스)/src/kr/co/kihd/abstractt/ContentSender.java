package kr.co.kihd.abstractt;


// 추상 클래스 : 1개 이상의 추상 메서드를 포함 하는 클래스.
// 추상 클래스는 인스턴스를 절대로 생성 할 수 없다.
// 추상 메서드 : 선언부만 존재하고 구현부가 없는 메서드.
public abstract class ContentSender {
	
	private String title;
	private String name;
	
	// 생성자 (멤버 생성자 초기화)
	public ContentSender(String title, String name) {
		super();
		this.title = title;
		this.name = name;
		
	}

	public String getTitle() {
		return title;
	}

	public String getName() {
		return name;
	}
	
	// 추상 메서드 (구현 안되어 있고 정의만 되어 있는 상태) 
	// => 상속을 통해서 반드시 재정의(override) 되어야 비로소 인스턴스를 생성 할 수 있다.
	public abstract void sendMessage(String content); 
		
		
	

	
	

}
