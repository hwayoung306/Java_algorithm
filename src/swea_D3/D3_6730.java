package swea_D3;

import java.util.Scanner;

public class D3_6730 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt(); // 직사각형의 블록수
			int[] arr = new int[n];

			for (int j = 0; j < arr.length; j++) { // 블록 높이들 arr에 넣기
				arr[j] = sc.nextInt();
			}

			int up = 0;
			int down = 0;

			for (int j = 1; j < arr.length; j++) {
				int now = arr[j];
				int before = arr[j - 1];

				if (now > before) {
					if(now-before > up) {
						up = now - before;
					}
				} else {
					if( before-now > down) {
						down = before - now;
					}
				}

			}
			
			System.out.println("#"+(i+1)+" "+up+" "+down);

		}

	}

}
