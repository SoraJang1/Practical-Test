package lv0_day3;

import java.util.Arrays;

public class Test02_middle {
	
	public int solution (int [] arr) {
		Arrays.sort(arr);
		return arr[(int)arr.length/2];
	}

}
