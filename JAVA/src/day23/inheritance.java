package day23;

public class inheritance {
	
	public static void main(String[] args) {
		Student st = new Student();
		st.breath();
		st.learn();
		
		Teacher t = new Teacher();
		t.eat();
		t.teach();
		
	}

}

class Person {
	void breath() {
		System.out.println("숨쉬기");
	}
	void eat() {
		System.out.println("밥먹기");
	}
	void say () {
		System.out.println("말하기");
	}
}

class Student extends Person {
	void learn () {
		System.out.println("배우기");
	}
}
//상속 시에 생성자는 상속되지 않는다

class Teacher extends Person {
	void teach () {
		System.out.println("가르치기");
	}
}