package day12;

public class Student {

	public static void main(String[] args) {
		
		int score1 = 100;
		int score2 = 80;
		int score3 = 70;
		
		System.out.println("1번째 학생의 점수 : " + score1 + "점");
		
		
		int[] scores = new int[3];
		scores[0] = 100;
		scores[1] = 80;
		scores[2] = 70;
		
		System.out.println("1번째 학생의 점수 : " + scores[0] + "점");

		
		for (int i=0; i<3; i++) {
			System.out.println(i + 1 + " 번째 학생의 점수 : " + scores[i] + "점");
		}
		
		System.out.println();
		
		
		
		
	}
}
