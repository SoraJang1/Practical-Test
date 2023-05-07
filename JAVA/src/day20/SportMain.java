package day20;

public class SportMain {
	
	public static void main(String[] args) {
		
		// 회원별 인스턴스 생성
		Member member1 = new Member();
		Member member2 = new Member();
		Member member3 = new Member();
		Member member4 = new Member();
		
		// 각 인스턴스 내 필드를 채워 주어 각 인스턴스 정보 입력
		member1.name="김철수";
		member1.age=32;
		member1.gender="남자";
		
		member2.name="김민호";
		member2.age=28;
		member2.gender="남자";
		
		member3.name="이영희";
		member3.age=24;
		member3.gender="여자";
		
		member4.name="김땡땡";
		member4.age=47;
		member4.gender="남자";

		// 회원정보 출력
		System.out.println("member1---------------");
		member1.info();
		System.out.println("member2---------------");
		member2.info();
		System.out.println("member3---------------");
		member3.info();
		System.out.println("member4---------------");
		member4.info();
		
		// 회원정보 출력
		member1.centerName="Bye"; 

		System.out.println("member1---------------");
		member1.info();
		System.out.println("member2---------------");
		member2.info();
		System.out.println("member3---------------");
		member3.info();
		System.out.println("member4---------------");
		member4.info();

	}
}

// 각각의 이름을 바꾸지 않고 하나의 변수만 변경해도 모든 값이 변한다
// 클래스변수는 모든 인스턴스가 같은 주소를 저장하고 있기 때문에

class Member {
	
	static String centerName="Smile";
	String name;
	int age;
	String gender;
	
	void info () {
		System.out.println("Center Name: " + centerName);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
	}
		
}
