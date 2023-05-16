package day26;

public class Interface3 {
	
	public static void main(String[] args) {
		
		MyCellPhone phone1 = new MyCellPhone();
		Camera phone2 = new MyCellPhone();
		Call phone3 = new MyCellPhone();
		Memo phone4 = new MyCellPhone();
		Clock phone5 = new MyCellPhone();
		PhoneUser user = new PhoneUser();

		user.user(phone1);
		user.user(phone2);
//		user.user(phone3);
//		user.user(phone4);
//		user.user(phone5);
		
		
		
	}

}

interface Camera {
	void photo();
}

interface Call {
	void calling();
}

interface Memo {
	void write();
}

interface Clock {
	void clock();
}


class MyCellPhone implements Camera, Call, Memo, Clock {
	
	@Override
	public void photo() {
		System.out.println("photo()");
	}
	
	@Override
	public void calling() {
		System.out.println("calling()");
	}
	
	@Override
	public void write() {
		System.out.println("write()");
	}
	
	@Override
	public void clock() {
		System.out.println("clock()");
	}
}

class PhoneUser {
	void user (Camera c) {
		System.out.println("사진을 찍습니다.");
	}
//	void user (Memo c) {
//		System.out.println("메모를 합니다.");
//	}
//	void user (Call c) {
//		System.out.println("전화를 걸었습니다.");
//	}
//	void user (Clock c) {
//		System.out.println("시계를 확인합니다");
//	}
}