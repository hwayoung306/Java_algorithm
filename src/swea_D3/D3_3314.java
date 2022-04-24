package swea_D3;

import java.util.Scanner;

public class D3_3314 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 1; i <= t; i++) {
			int sum = 0;
			int [] arr = new int[5];
			for(int j =0; j<5; j++) {
				int score = sc.nextInt();
				if(score < 40) {
					arr[j] = 40;
				}else {
					arr[j] = score;
				}sum += arr[j];	
			}
			System.out.println("#"+i+" "+sum/5);
		}
		
	}
}
