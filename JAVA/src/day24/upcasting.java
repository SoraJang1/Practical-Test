package day24;

public class upcasting {
	
	public static void main(String[] args) {
		
		Student st1 = new Student("이름", 25, "취미", 2);
		st1.info();
		st1.study();
		
		// 업캐스팅
		Human h1 = new Student("업캐스팅", 12, "게임", 5);
		h1.info();
		// 상속받은 자식클래스를 부모클래스에서 사용할 때 동적바인딩이 일어난다
		// 값은 자식 값으로 채우되 공간은 부모의 것이다
		
		// h1.study(); 사용불가
        // h1.grade(); 사용불가
		
	}

}

class Human {
	
	String name;
	int age;
	String hobby;
	
	public Human(String name, int age, String hobby) {
		super();
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	
	void info() { //동적, 변수
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("hobby: " + hobby);
	}
}

class Student extends Human {
	
	int grade; 
	
	public Student (String name, int age, String hobby, int grade) {
		
		super(name, age, hobby);
		this.grade=grade;
	}
	
	void info() { // 오버라이딩
		super.info();
		System.out.println("grade: " + grade);
	}
	
	void study () {
		System.out.println("공부하기");
	}
}