package day27;

public class Inner {
	
	public static void main(String[] args) {
		
		OuterClass oc = new OuterClass();
		System.out.println("OuterClass의 a의 값: " + oc.a);
		System.out.println("OuterClass의 b의 값: " + OuterClass.b);
		
		System.out.println("=====inner class 접근하기=====");
		OuterClass oc2 = new OuterClass();
		OuterClass.Inner i = oc2.new Inner();
		
		System.out.println("Inner의 c의 값: " + i.c);
		i.innerMethod();
		
		OuterClass.StaticInner si = new OuterClass.StaticInner();
		System.out.println("StaticInner의 d의 값: " + si.d);
		// 내부 클래스의 객체를 생성하는 방법
		// 외부클래스.내부클래스명 객체명 = new 외부클래스생성자().내부클래스생성자();
		
		si.staticMethod(); // 객체를 사용하지 않고 클래스명을 사용해서 호출
		OuterClass.StaticInner.staticMethod();
		
				
	}

}

class OuterClass {
	int a=3;
	static int b=4;
	
	class Inner {
		int c=5;
		public void innerMethod () {
			System.out.println("<Inner Class>");
		}
	}
	static class StaticInner {
		int d=6;
		static int stat=10;
		public static void staticMethod() {
			System.out.println("<Static Inner>");
		}
	}
}



