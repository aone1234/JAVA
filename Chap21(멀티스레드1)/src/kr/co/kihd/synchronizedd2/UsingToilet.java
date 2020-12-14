package kr.co.kihd.synchronizedd2;

public class UsingToilet extends Thread {
	
	// 공유객체
	private Toilet toilet;
	
	public UsingToilet(Toilet toilet, String name) {
		this.toilet = toilet;
		this.setName(name);		
	}

	@Override
	public void run() {
		try {
			this.toilet.noke();
			this.toilet.use();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
