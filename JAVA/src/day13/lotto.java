package day13;

/*
로또 프로그램 생성

1등부터 5등까지 존재
45개의 숫자 중 6개의 숫자 맞추기

6개의 숫자 중 5개의 숫자와 보너스 번호를 맞추면 2등
6개의 숫자 중 5개의 숫자를 맞히면 3등
6개의 숫자 중 4개의 숫자를 맞히면 4등
6개의 숫자 중 3개의 숫자를 맞히면 3등
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class lotto {
	
	public static void main(String[] args) {
		
		// 필요한 기능의 정리
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		// 배열 정의
		int lottoArr [] = new int[6];
		int userArr [] = new int[6];
				
		// 사용할 변수들 지정
		int bonus;
		int bonusUser;
		int cnt=0;
		
		// 로또값 6자리 저장		
		for (int i=0; i<6; i++) {
			lottoArr [i] = rd.nextInt(45)+1;
		}
		
		// 보너스값 1개 저장
		bonus = rd.nextInt(45)+1;
		
		System.out.println("User : " + Arrays.toString(lottoArr) + ", bonus number: " + bonus);
		
		
		// 사용자에게 로또번호 6개 숫자와 보너스번호 1개 숫자를 받음
		System.out.println("로또번호 6자리를 선택하세요");
		for (int i=0; i<6; i++) {
			userArr [i] = sc.nextInt();
		}
		
		System.out.println("보너스 값 숫자를 입력하세요");
		bonusUser = sc.nextInt();
		
		
		// 로또 배열의 값과 사용자 입력값을 비교
		for (int i=0; i<6; i++) {
			for (int j=0; j<6; j++) {
				if (lottoArr [i] ==userArr[j]) {
					cnt++;
				}
			}
		}
		
		// count의 개수에 따라 등수 정하기
		if (cnt==6) {
			System.out.println("축하합니다! 1등에 당첨되셨습니다");
		} else if (cnt==5) {
			if(bonus==bonusUser) {
				System.out.println("축하합니다! 2등에 당첨되셨습니다");
			} else {
				System.out.println("축하합니다! 3등에 당첨되셨습니다");
			}
		} else if (cnt==4) {
			System.out.println("축하합니다! 4등에 당첨되셨습니다");
		} else if (cnt==3){
			System.out.println("축하합니다, 5등입니다");
		} else {
			System.out.println("꽝! 다음 기회에");
		}
		
		
	}

}
