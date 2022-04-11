package return_method;

import java.util.Scanner;

public class test2_10870 {

	public static void main(String[] args) {
		// 피보나치 수
		// n 번째 피보나치 수 구하는 방법
		// 전 2개 더하면! 0/1/1/2/3/5....

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Fibonacci(n));

	}

	private static int Fibonacci(int n) {
	
		if( n == 0) {
			return 0;
		}else if( n == 1) {
			return 1;
		}else {
			return Fibonacci(n-1) + Fibonacci(n-2);
		}
	
	}
}
