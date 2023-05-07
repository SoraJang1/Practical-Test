package day19;

public class FirstClass {
	
	public static void main(String[] args) {
		// 변수=객체값;
		// 클래스명 참조변수 = new 클래스명();
		ClassA ca = new ClassA();
		
		System.out.println(ca.x);
		ca.fi(); // 객체 내의 변수 사용
		
		ca.x=30; // 객체 내의 변수에 값 지정
		System.out.println(ca.x);
	}

}

class ClassA {
	
	int x=10;
	void fi() {
		System.out.println("f1()");
	}
	
	
}




