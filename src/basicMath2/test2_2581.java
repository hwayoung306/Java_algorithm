package basicMath2;

import java.util.Scanner;

public class test2_2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		boolean prime = true;
		int count = 0;
		int sum = 0;
		int min = 0;

		for (int i = M; i <= N; i++) { // M이상 N이하
			if (i == 1) { // 1은 소수가 아니니까
				prime = false;
			} else { 
				for (int j = 2; j < i; j++) { // 2부터 i(M)전까지 다 나눠보기
					if (i % j == 0) { // 나눠진다 즉, 1과 자기 자신 이외의 약수가 있다 = 소수 아님
						prime = false;
					}
				}
			}

			if (prime) {
				count++;
				sum += i;
				if(count == 1) {
					min = i;
				}
				
			}

			prime = true;
		}

		if(count == 0) {
			System.out.println("-1");
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		sc.close();


	}

}
