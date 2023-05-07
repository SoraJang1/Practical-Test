package lv0_day3;

public class Test03_frequent {
	
	public static void main(String[] args) {
		
		int ans;
		int [] arr = new int [0];
		
		int max=0;
		int frq [] = new int [1000];
		
		for (int i=0; i<arr.length; i++) {
			frq [arr[i]]++;
			
			if(max<frq[arr[i]]) {
				max=frq[arr[i]];
				ans = arr[i];
			}
		}

		int temp = 0;
		
		for (int i=0; i<1000; i++) {
			if(max == frq[i]) {
				temp++;
			}
			if(temp > 1) {
				ans = -1;
			}
		}
	}

}
