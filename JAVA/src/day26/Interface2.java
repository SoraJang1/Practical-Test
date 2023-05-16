package day26;

public class Interface2 {
	
	public static void main(String[] args) {
		
		TourGuide guide = new TourGuide();
		
		guide.leisureSports();
		guide.sightseeing();
		guide.food();
		
	}

}

interface Providable {
	void leisureSports();
	void sightseeing();
	void food();
}

class KoreaTour implements Providable {
	
	@Override
	public void leisureSports() {
		System.out.println("한강 수상스키");
	}
	
	@Override
	public void sightseeing() {
		System.out.println("경복궁 관람 투어");
	}
	
	@Override
	public void food() {
		System.out.println("전주 비빔밥 투어");
	}
}

class JapanTour implements Providable {
	
	@Override
	public void leisureSports() {
		System.out.println("도쿄타워 번지점프");
	}
	
	@Override
	public void sightseeing() {
		System.out.println("오사카 시내 투어");
	}
	
	@Override
	public void food() {
		System.out.println("초밥 투어");
	}
}


class TourGuide {
//	private Providable tour = new KoreaTour();
	private Providable tour = new JapanTour();
	
	public void leisureSports() {
		tour.leisureSports();
	}
	
	public void sightseeing() {
		tour.sightseeing();
	}
	
	public void food() {
		tour.food();
	}
}

