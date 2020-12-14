package kr.co.kihd.inheritancereview;

class Person {
	String name;
	String id;
	public Person(String name) {
		this.name = name;
		
	}
	
}

class Student extends Person {
	String grade;
	String department;
	
	public Student(String name) {
		super(name);
		
	}
	
}

public class UpcastingEx {

	public static void main(String[] args) {
		Student stu = new Student("홍길동");
		stu.department = "컴퓨터과";
		Person per = new Student("최지만");       	// Upcasting  (자동형 변환)
		per.id = "111";
		
		
	}

}
