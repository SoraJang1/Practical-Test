package day17;

public class Method1 {
	
	public static void main(String[] args) {
		open();
		f1(100);
	}
	
	static void open () {
		System.out.println("문 열어");
		System.out.println("바닥 청소하기");
		System.out.println("창문 열기");
	}
	
	static void f1 (int x) {
		System.out.println(x);
	}

}
