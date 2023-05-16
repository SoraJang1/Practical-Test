package day27;

public class InnerClass {
	
	public static void main(String[] args) {
		
	}

}

class A {
	
	static class StaticInner {
		
	}
	class InstanceInner {
		
	}
	
	StaticInner st = new StaticInner();
	InstanceInner ii = new InstanceInner();
	
	static void StaticMethod () {
		StaticInner st2 = new StaticInner();
//		InstanceInner ii2 = new InstanceInner(); -> static메서드는 인스턴스 멤버에 접근 불가능
		
	}
	
	void InstanceMethod () {
		StaticInner st3 = new StaticInner();
		InstanceInner ii3 = new InstanceInner();
		// 인스턴스 메서드는 스태틱 클래스, 인스턴스 클래스 모두 접근 가능
	}
	
	// 스태틱 클래스와 인스턴스 클래스 두 클래스 모두 객체 생성 가능
}

