package basicMath1;

import java.util.Scanner;

public class test6_2775 {

	public static void main(String[] args) {
		// a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수 합만큼
		// 사람들을 데려와 살아야 한다.
		// 비어있는 집은 없고, 모든 거주민들이 이 계약조건을 지켰을 때
		// k와 n에 대해 k층의 n호에는 몇명이 살고있는지 출력
		// 0층부터 0층의 i호에는 i 명씩 산다.
		 int[][] arr = new int[15][15];
		 
		 for(int i = 0; i < 15; i++) {
			 arr[i][1] = 1; // 호수는 1호부터 시작해서  14호까지 있음
			 arr[0][i] = i; // 0층 초기화 0층부터 14층까지
		 }
		
		for(int i = 1; i < 15; i++) {
			for(int j = 2; j < 15; j++) { // 0호는 없고, 1호에는 다 1값
				arr[i][j] = arr[i][j-1]+arr[i-1][j];
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			 int k = sc.nextInt();
			 int n = sc.nextInt();
			 System.out.println(arr[k][n]);
		}
	}

}
