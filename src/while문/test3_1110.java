package while¹®;

import java.util.Scanner;

public class test3_1110 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int copy = n;
		int cycle = 0;

		while (true) {
			n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
			cycle++;

			if (copy == n) {
				break;
			}
		}

		System.out.println(cycle);

	}

}
