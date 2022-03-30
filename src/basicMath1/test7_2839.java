package basicMath1;

import java.util.Scanner;

public class test7_2839 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = 0;
		
		while (true) {
			if (n % 5 == 0) {
				count += n / 5;
				break;
			} else if (n/3 > 0) {
				n = n-3;
				count++;
				if(n == 0) {
					break;
				}
			} else {
				count = -1;
				break;
			}
		}
		
		System.out.println(count);
	}
}
