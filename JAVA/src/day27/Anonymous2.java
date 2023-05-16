package day27;

public class Anonymous2 {

	public static void main(String[] args) {
		
//		Inter1 it = new Inter(); // 인터페이스는 객체를 생성할 수 없다
		
		Inter1 it = new Inter1() { // 익명 클래스를 이용해 일회성으로 사용할 수 있다
			
			@Override
			public void f1() {
				System.out.println("inter1 imple f1()");
				
			}
		};
		it.f1();

	}
	
}

interface Inter1 {
	void f1();
}

class Inter1Impl implements Inter1 {
	
	@Override
	public void f1() {
		
	}
}
