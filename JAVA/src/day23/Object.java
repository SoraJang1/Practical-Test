package day23;

public class Object {

	public static void main(String[] args) {
		
		Aclass a1 = new Aclass();
		Aclass a2 = new Aclass();
		
		System.out.println(a1.toString());
		System.out.println(a1);
		// 객체정보의 문자열 출력
		
		System.out.println(a1.equals(a1));
		// 두 객체가 동일한가를 비교
		
		System.out.println(a1.getClass());
		// 객체의 클래스정보를 가져옴
		
	}
}

class Aclass {
	
	public String toString () {
		return "Bclass 객체";
	}
	
	public boolean equals (Object obj) {
		return true;
	}
	
}