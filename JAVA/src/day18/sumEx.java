package day18;

public class sumEx {
	
	public static void main(String[] args) {
		
		sum (10, 20);
		sum (1.23, 3.12);
		sum (10, 20, 30);
			
	}
	
	//메서드의 매개변수 타입의 변화
	static void sum (int x, int y) {
		System.out.println(x+y);
	}
	
	static void sum (double x, double y) {
		System.out.println(x+y);
	}
	
	// 메서드의 개수가 다른 경우
	static void sum (int x, int y, int z) {
		System.out.println(x+y+z);
	}

}
