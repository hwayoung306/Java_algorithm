package 배열1차원;

import java.util.Scanner;

public class test7_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		float[] result = new float[c];

		for (int i = 0; i < c; i++) {
			int student = sc.nextInt();
			int[] score = new int[student];
			int total = 0;
			int mid = 0;
			int count = 0;

			for (int j = 0; j < student; j++) {
				score[j] = sc.nextInt();
				total += score[j];
				}
			mid = total / student;

			for (int j = 0; j < score.length; j++) {
				if (score[j] > mid) {
					count++;
				}
			}
		
			result[i] = ((float)count/student)*100;

		}
		
		for(int j = 0; j < result.length; j++) {
			System.out.println(String.format("%.3f", result[j]) + "%");
		}

	}

}
