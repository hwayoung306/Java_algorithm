package basicMath2;

import java.util.Scanner;

public class test5_4948 {

	public static void main(String[] args) {

		int[] a = new int[246914];
		for (int i = 2; i <= 246913; i++) {
			a[i] = i;
		}

		for (int i = 2; i <= 246913; i++) {
			if (a[i] == 0) {
				continue;
			}
			for (int j = 2 * i; j <= 246913; j += i) {
				a[j] = 0;
			}
		}

///////////////////////////////////////////////////////////////////
		int n = -1;

		Scanner sc = new Scanner(System.in);

		while (true) {
			n = sc.nextInt();
			if(n==0) {
				break;
			}
			int count = 0;
			for (int i = n + 1; i <= 2 * n; i++) {
				if (a[i] != 0) {
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
