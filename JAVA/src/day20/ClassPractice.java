package day20;

public class ClassPractice {
	
	public static void main(String[] args) {
		
		System.out.println(CarPractice.wheel);
		
		CarPractice mycar1 = new CarPractice();
		System.out.println(mycar1.speed);
		
		CarPractice mycar2 = new CarPractice();
		System.out.println("<변경 전>");
		System.out.println("mycar1.speed: " + mycar1.speed);
		System.out.println("mycar2.speed: " + mycar2.speed);
		System.out.println("mycar1.wheel: " + mycar1.wheel);
		System.out.println("mycar2.wheel: " + mycar2.wheel);
		
		mycar2.speed=100;
		mycar2.wheel=5;
		
		System.out.println("<변경 후>");
		System.out.println("mycar1.speed: " + mycar1.speed);
		System.out.println("mycar2.speed: " + mycar2.speed);
		System.out.println("mycar1.wheel: " + mycar1.wheel);
		System.out.println("mycar2.wheel: " + mycar2.wheel);
		
	}
}


class CarPractice {
	
	static int wheel=4; // 클래스 변수
	int speed; // 인스턴스 변수
	
}

//speed값은 인스턴스 변수여서 객체마다 각각의 고유한 값을 유지하고 있다
//wheel값은 클래스 변수여서 모든 객체가 공통적으로 가지고 있는 공유하는 변수이다



