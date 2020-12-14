package kr.co.kihd.inheritancereview;

class Person3 {}
class Student3 extends Person3 {}
class Researcher3 extends Person3 {}
class Professor3 extends Person3 {}

public class InstanceOfEx {
	
	static void print(Person3 person3) {
		if (person3 instanceof Person3)
			 System.out.println("Person 타입임");
		if (person3 instanceof Student3)
			 System.out.println("Student3 타입임");
		if (person3 instanceof Researcher3)
			 System.out.println("Researcher3 타입임");
		if (person3 instanceof Professor3)
			 System.out.println("Professor3 타입임");
		
	}

	public static void main(String[] args) {
		InstanceOfEx.print(new Student3());
		System.out.println("\n=================\n");
		print(new Researcher3());
		System.out.println("\n=================\n");
		print(new Professor3());
		
	}
	
}
