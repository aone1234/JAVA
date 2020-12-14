package kr.co.kihd.constructor1;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.getAge());
		System.out.println(student);
		
		// 매개변수가 있는 생성자를 호출
		Student student2 = new Student("최지만", 50);
		System.out.println(student2);
		
		// 매개변수가 있는 생성자를 호출
		Student student3 = new Student("류현진");
		System.out.println(student3);
		
		// 매개변수가 있는 생성자를 호출
		Student student4 = new Student(35);
		System.out.println(student4);
		
	}

}
