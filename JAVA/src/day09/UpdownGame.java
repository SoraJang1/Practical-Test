package day09;

import java.util.Random;
import java.util.Scanner;

public class UpdownGame {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random random = new Random();
		int no = random.nextInt(100)+1;

		int user = -1; // 최소 1번은 실행시키기 위해 user값이 거짓이 될 수 있도록 설정
		
		while (user != no) {
			System.out.println("숫자 입력 : ");
			user = sc.nextInt();
			
			if (user==no) {
				System.out.println("정답입니다");
			}
			if (user > no) {
				System.out.println("Down!");
			} else {
				System.out.println("Up!");
			}
			
		}
		
	}

}
