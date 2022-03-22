package 배열1차원;

import java.util.Scanner;

public class test5_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] score = new int[n];
		int max = 0;
		
		for(int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			if(max < score[i]) {
				max = score[i];
			}
		}
		
		float all = 0;
		
		for(int i = 0; i < score.length; i++) {
			all += (float)score[i]/max*100;
		}
 
		System.out.println(all/n);
	}

}
