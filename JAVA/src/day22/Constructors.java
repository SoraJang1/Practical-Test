package day22;

public class Constructors {
	
	public static void main(String[] args) {
		
		Bclass b1 = new Bclass("김땡땡");
		System.out.println(b1.name);
	}
}

class Bclass {
	
	String name;
	
	Bclass (String name){ // 매개변수 생성자
		System.out.println("Bclass의 매개변수 생성자()");
		this.name=name;
		
		// this : 현재 객체를 지칭하기 위한 키워드
		// 매개변수의 변수명과 객체 내 변수의 이름이 같을 경우 this를 사용해서 구분
	}
}
