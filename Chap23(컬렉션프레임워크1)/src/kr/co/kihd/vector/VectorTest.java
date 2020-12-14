package kr.co.kihd.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		// 용량이 5인 벡터를 생성한다.
		Vector<Board> vector = new Vector<>(5);
	    System.out.println("용 량 : " + vector.capacity());
	    System.out.println("초기 사이즈 : " + vector.size());
	    System.out.println("\n-----------------------\n");
	    
	    // 객체추가
	    vector.add(new Board("제목1\t", "내용1\t", "글쓴이1\t"));
	    vector.add(new Board("제목2\t", "내용2\t", "글쓴이2\t"));
	    vector.add(new Board("제목3\t", "내용3\t", "글쓴이3\t"));
	    vector.add(new Board("제목4\t", "내용4\t", "글쓴이4\t"));
	    vector.add(new Board("제목5\t", "내용5\t", "글쓴이5\t"));
	    
	    System.out.println("객체 추가 후 용 량 : " + vector.capacity());
	    System.out.println("객체 추가 후 사이즈 : " + vector.size());
	    System.out.println("\n------------------------\n");
	    
	    // 객체 삭제
	    vector.remove(2);
	    vector.remove(3);
	    System.out.println("객체 삭제 후 용 량 : " + vector.capacity());
	    System.out.println("객체 삭제 후 사이즈 : " + vector.size());
	    System.out.println("\n------------------------\n");
	 
	    // 용량만 확보
	    vector.ensureCapacity(20);		// 배열복사
	    System.out.println("용량 확보 후 용 량 : " + vector.capacity());
	    System.out.println("용량 확보 후 사이즈 : " + vector.size());
	    System.out.println("\n------------------------\n");
	    
	    // null값 포함하여 size값 변경
	    vector.setSize(3);				// 배열복사
	    System.out.println("size값 변경 후 용 량 : " + vector.capacity());
	    System.out.println("size값 변경 후 사이즈 : " + vector.size());
	    System.out.println("\n------------------------\n");
	    
	    // size로 잡히지 않은 null 값은 삭제를 해 준다.
	    vector.trimToSize();
	    System.out.println("null값 삭제 후 용 량 : " + vector.capacity());
	    System.out.println("null값 삭제 후 사이즈 : " + vector.size());
	    System.out.println("\n------------------------\n");
	    
	    for(Board board : vector) {
	    	System.out.println(board.subject + board.content + board.writer);
	    	
	    }
	    System.out.println("\n------------------------\n");
	    
	    // 반복자로 출력하기
	    Iterator<Board> iterator = vector.iterator();
	    while(iterator.hasNext()) {		        // 가져올 데이터 있느냐?
	    	Board board = iterator.next();		// 있으면 가져와라
	    	System.out.println(board.subject + board.content + board.writer);
	    }
	    
	}

}









































