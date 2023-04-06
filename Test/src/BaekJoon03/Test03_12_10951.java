package BaekJoon03;

/*
문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
각 테스트 케이스마다 A+B를 출력한다.
*/

import java.util.Scanner;

public class Test03_12_10951 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextInt()) { 
			// hasNextInt()의 경우
			// 1) 입력값이 정수일 경우 true를 반환
			// 2) 정수가 아닐 경우 예외를 던지며 hasNextInt()에서 false를 반환하면서 더 이상의 입력을 받지 않고 반복문 종료
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
		}
	
	}

}
