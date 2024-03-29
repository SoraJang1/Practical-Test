package day16;

import java.util.Scanner;

public class Cafe {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt=0; // 총 주문갯수
		String orderList [] = new String [5]; // 메뉴 주문은 5개까지만 받을게요
		int total=0; // 총 결제금액
	 			
		while (true) {
			System.out.println("=========CAFE ORDER HERE=========");
			System.out.print("1.주문하기 2.취소하기 3.결제하기 4.끝내기\n---------------------------------\n입력 : ");
			int user = sc.nextInt();
			System.out.println();
			
			if (user==1) {
				System.out.print("=================================\n"
						+ "1.아메리카노 3500원\n2.카페라떼 3800원\n3.밀크티 4200원\n4.딸기에이드 4500원\n5.우유 3000원\n"
						+ "---------------------------------\n"
						+ "주문할 메뉴 번호 : ");
				int menuSelect = sc.nextInt();
				
				String menuName="";
				int menuPrice=0;
				
				if (menuSelect==1) {
					menuName = "아메리카노";
					menuPrice = 3500;
				} else if (menuSelect==2) {
					menuName = "카페라떼";
					menuPrice = 3800;
				} else if (menuSelect==3) {
					menuName = "밀크티";
					menuPrice = 4200;
				} else if (menuSelect==4) {
					menuName = "딸기에이드";
					menuPrice = 4500;
				} else if (menuSelect==5) {
					menuName = "우유";
					menuPrice = 3000;
				} else {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
				
				total+=menuPrice;
				orderList[cnt]=menuName;
				cnt++;
				System.out.println("=================================\n"
							+ menuName + "가 주문되었습니다.\n가격은 " + menuPrice + "원 입니다.\n");
				
			} else if (user==2) {
				System.out.println("================================="
						+ "\n주문입력된 메뉴 리스트");

				for (int i=0; i<cnt; i++) {
					System.out.println("["+ (i+1) + "] " + orderList[i]);
				}
				
				System.out.print("---------------------------------\n취소할 메뉴 번호 : ");
				int menuCancel = sc.nextInt();
				
				if (menuCancel >= 1 && menuCancel <= cnt) {
					String menuDelete = orderList[menuCancel-1];
					
					System.out.println(menuDelete + " 메뉴가 주문목록에서 삭제되었습니다");
					
					for (int i=menuCancel-1; i<cnt; i++) {
						orderList[i] = orderList[i+1];
					}
					
					if (menuDelete.equals("아메리카노")) {
						total-=3500;						
					} else if (menuDelete.equals("카페라떼")) {
						total-=3800;
					} else if (menuDelete.equals("밀크티")) {
						total-=4200;
					} else if (menuDelete.equals("딸기에이드")) {
						total-=4500;
					} else if (menuDelete.equals("우유")) {
						total-=3000;
					} 
					cnt--;			
				}
				System.out.println();

			} else if (user==3) {
				System.out.print("---------------------------------\n총 결제금액 : " + total + "원\n지불할 금액 : ");
					int money = sc.nextInt();
					System.out.println("=================================");

				if (money < total) {
					System.out.println("지불금액이 부족합니다.");
				} else {
					System.out.println("결제가 완료되었습니다.\n잔돈은 " + (money-total) + "원 입니다.");
					total=0;
					for (int i=0; i<5; i++) {
						orderList[i]="";
					}
				}
				System.out.println();
			} else if (user==4) {
				System.out.println("=================================\n프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
			

		
	}

}
