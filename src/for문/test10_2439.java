package for문;

import java.util.Scanner;

public class test10_2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = n-i; j > 0; j--) {
				System.out.print(" ");
			}
			for(int j = i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
