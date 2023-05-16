package day24;

public class Polymorphism {
	
	public static void main(String[] args) {
		
		A obj = new B(); // 부모의 변수=자식값 ; 업캐스팅 
		
		obj.methodA();
		// obj.methodB(); 불가
		
	}

}

class A {
	void methodA () {
		System.out.println("methodA");
	}
}

class B extends A{
	void methodB () {
		System.out.println("methodB");		
	}
}