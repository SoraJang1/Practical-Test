package day18;

// 두 수를 전달받아 사칙연산 구현하기
// 단, 정수와 실수 모두 가능해야 한다

public class Calc {
	
	public static void main(String[] args) {		
		System.out.println(sum (40, 20));
		System.out.println(sub (40, 20));
		System.out.println(mul (40, 20));
		System.out.println(div (40, 20));

		System.out.println(sum (1.3, 4.5));
		System.out.println(sub (3.54, 2.25));
		System.out.println(mul (5.5, 4.28));
		System.out.println(div (8.54, 2.74));
		
		System.out.println(sum ("hello", "world"));

	}

	// 정수형의 사칙연산
	
	static int sum (int x, int y) {
		return x+y;
	}
	static int sub (int x, int y) {
		return x-y;
	}
	static int mul (int x, int y) {
		return x*y;
	}
	static int div (int x, int y) {
		return x/y;
	}
 	
	// 실수형의 사칙연산
	
	static double sum (double x, double y) {
		return x+y;
	}
	static double sub (double x, double y) {
		return x-y;
	}
	static double mul (double x, double y) {
		return x*y;
	}
	static double div (double x, double y) {
		return x/y;
	}
	
	// 문자열의 덧셈연산
	
	static String sum (String x, String y) {
		return x+y;
	}
	
}
