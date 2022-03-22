package 배열1차원;

import java.util.Scanner;

public class test4_3052Hash {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt() % 42;

			
				boolean check = false;
				for (int j = 0; j < i; j++) {
					if (arr[i] == arr[j]) {
						check = true; // 같은 수가 있을 경우
						break;
					} else {
						check = false;
					}
				}

				if (check == false) {
					count++;
				}

		}

		System.out.println(count);
	}
}
