package basicMath2;

import java.util.Scanner;

public class test1_1978 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean prime = true;
		int count = 0;

		for (int i = 0; i < n; i++) { // n번동안 반복
			int a = sc.nextInt(); // 입력받은 수

			if (a == 1) { // 1은 소수가 아니니까
				prime = false;
			} else { 
				
				for (int j = 2; j < a; j++) { // 2부터 숫자 전까지 다 나눠보기
					if (a % j == 0) { // 나눠진다 즉, 1과 자기 자신 이외의 약수가 있다 = 소수 아님
						prime = false;
					}
				}
			}

			if (prime) {
				count++;
			}

			prime = true;
		}

		System.out.println(count);
		sc.close();

	}

}
