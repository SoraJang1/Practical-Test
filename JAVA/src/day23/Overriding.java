package day23;

public class Overriding {
	
	public static void main(String[] args) {
		
		Leader ld = new Leader();
		
		ld.learn();
		ld.lead();
		ld.say();
		
	}

}

class Student2 {
	
	void learn () {
		System.out.println("배우기");
	}
	void eat () {
		System.out.println("밥먹기");
	}
	void say () {
		System.out.println("선생님 안녕하세요");
	}

}

class Leader extends Student2 {
	void lead () {
		System.out.println("반장으로 솔선수범하겠습니다.");
	}
	void say () {
		System.out.println("선생님께 인사!");
		super.say();
	}
}
