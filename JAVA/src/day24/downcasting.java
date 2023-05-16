package day24;

public class downcasting {
	
	public static void main(String[] args) {
		
		// 업캐스팅 된 클래스
		Human h1 = new Student("학생", 2, "게임", 3);
		
		// 다운캐스팅
		Student s1 = (Student)h1;
		s1.info();
		s1.study();
	}

}


