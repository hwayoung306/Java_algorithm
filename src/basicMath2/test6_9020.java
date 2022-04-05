package basicMath2;

import java.util.Scanner;

public class test6_9020 {

	public static void main(String[] args) {
		// 2보다 큰 모든 짝수는 두 소수의 합! 으로 나타낼 수 있다
		// 어러 조합일 경우 두 소수의 차이가 가장 작은 것을 출력한다

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		// 소수 배열 만들기
		int[] arr = new int[10001];
		for (int i = 2; i < arr.length; i++) {
			arr[i] = i;
		}
		
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] == 0) {
				continue;
			}
			for (int j = 2 * i; j < arr.length;  j += i) {
				arr[j] = 0;
			}
		} 
		
//		for(int i = 0; i <arr.length;i++) {
//			System.out.println(i+"는"+ arr[i]);
//		}
		// 소수 배열만들기 끝

		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			
			int min = 1;
			int max = 1;

			for (int j = 2 ; j <= n / 2; j++) {
				if (arr[j] == 0) {
					continue;
				}
				int a = arr[j];
				int b = n-arr[j];
				//System.out.println("arr[n - arr[j]]의 값은" + arr[b]);
				//System.out.println("a, b의 값은 " + a +" " + b);
				if (arr[n - arr[j]] != 0) {
					//System.out.println("arr[j]의 값은"+ arr[j]);
					min = arr[j];
					max = n - arr[j];
				}
			}

			System.out.println(min + " " + max);

		}

	}

}
