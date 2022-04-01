package character_string;

import java.util.Scanner;

public class test10_1032 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		char[] arr = new char[50];

		for (int i = 0; i < T; i++) {
			String a = sc.next();
			

			if (i == 0) {
				arr = a.toCharArray();
				
			} else {
				for (int j = 0; j < a.length(); j++) {
					if (a.charAt(j) != arr[j]) {
						arr[j] = '?';
					}
				}

			}

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

}
