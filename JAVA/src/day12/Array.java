package day12;

import java.awt.geom.CubicCurve2D;
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int[] a = new int[] {10, 20, 4, 25, 18};
		int [] b = {1, 2, 3, 4, 5, 6, 7}; // b라는 정수형 배열을 생성할 때, 초기값으로 넣는 방법으로 new int[ ] 는 생략 가능하다
		
		
		int c[] = new int[10];
		for (int i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}
		
		System.out.println(c);
		System.out.println(Arrays.toString(c));
		
	}
}
