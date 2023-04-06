package day14;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		
		int scores[][] = new int[4][3];
		String subject[] = {"국어", "영어", "수학"};
		
		Scanner sc = new Scanner (System.in);
		
		// 2차원 배열을 활용해 사용자에게 입력받은 값을 저장하는 방법
		for (int j=0; j<4; j++) {
			System.out.println(j+1 + "번 학생 점수 ----------");

			for (int i=0; i<3; i++) {
				System.out.print(subject[i] + ": ");
				scores[j][i] = sc.nextInt();

			}
			
		}
		
		// 2차원 배열에 저장된 값을 출력
		
		for (int i=0; i<3; i++) {
			System.out.print("\t" + subject[i]);
		}
		
		System.out.println();
		for (int j=0; j<4; j++) {
			System.out.print(j+1 + "번:\t");

			for (int i=0; i<3; i++) {
				System.out.print(scores[j][i] + "\t");
			}
			System.out.println();
		}

	}

}
