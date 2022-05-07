package swea_D3;

import java.util.Scanner;

public class D3_12368 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result = 0;
			result = a+b;
			if( result >= 24) {
				result = result - 24;
			}
			
			System.out.println("#" + (i+1) +" "+ result);
		}

	}

}
