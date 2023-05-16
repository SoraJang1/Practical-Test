package day26;

public class Interface {
	
	public static void main(String[] args) {
		
		B b = new B();
				
		b.methodA();
		b.methodB();
		
	}

}

interface Ainter {
	final int x=10;
	int y=20; // final 생략 가능 -> 상수이다
	
	abstract void methodA();
	void methodB(); // abstract생략 가능

}

class B implements Ainter {
	
	@Override
	public void methodA() {
		System.out.println("methodA()");
		
	}
	
	@Override
	public void methodB() {
		System.out.println("methodB()");
	
	}

}
