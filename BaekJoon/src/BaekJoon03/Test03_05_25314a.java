package BaekJoon03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test03_05_25314a {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int ans = N/4;
		
		System.out.println("long ".repeat(ans) + "int");
	}
}
