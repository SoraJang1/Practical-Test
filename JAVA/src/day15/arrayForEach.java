package day15;

import java.util.Scanner;

public class arrayForEach {
	
	public static void main(String[] args) {
		
		String a [] = {"Java", "Hello", "Programming"};
		
		for (String i : a) {
		// i라는 변수가 a라는 배열을 순환할게
		System.out.println(i);
		}
		
		int b[] = {1, 2, 3, 4, 5};
		
		for (int i : b) {
			
			System.out.println(i);
		}
			
		Scanner sc = new Scanner(System.in);
			
		System.out.println("주문할 과일 3개를 입력하세요 : ");
		String fruits [] = {sc.nextLine(), sc.nextLine(), sc.nextLine()};
		
		System.out.println("================================");
		System.out.println("주문받은 과일");
		for (String eachFruits : fruits) {
			System.out.println(eachFruits);
		}
			
	}

}
