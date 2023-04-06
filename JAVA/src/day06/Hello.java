package day06;

public class Hello {
	
	public static void main(String[] args) {
		
		String s = "Hello";
		System.out.println(s instanceof String);
		// String s가 자바에서 만들어진 객체니?
		
		int i=3;
		System.out.println(Integer.valueOf(i) instanceof Integer);
		
		float f=3.14f;
		System.out.println(Float.valueOf(f) instanceof Float);
		
		double d=3.14;
		System.out.println(Double.valueOf(d) instanceof Double);
		
		char c='a';
		System.out.println(Character.valueOf(c) instanceof Character);
		
	}

}
