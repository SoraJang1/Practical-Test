package day21;

public class ObjectArray {

	public static void main(String[] args) {
		
		Aclass ar [] = new Aclass [3];
		
		ar[0] = new Aclass(); // 객체를 생성해야만 객체 내 필드 접근 가능
		
		ar[0].x=100;
		ar[0].f1();
		
		System.out.println(ar[0].x);
	}
	
}

class Aclass {
	
	int x;
	
	void f1() {
		System.out.println("x: " + x);
	}
	
}