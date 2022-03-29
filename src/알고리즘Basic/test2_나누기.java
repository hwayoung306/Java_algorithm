package 알고리즘Basic;

import java.util.Scanner;

public class test2_나누기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = 0;
		int B = 0;
		
		int check = sc.nextInt();
		if(check > 0) {
			A = check;
		}
		
		int check2 = sc.nextInt();
		if(check2 < 10) {
			B = check2;
		}
		
		System.out.println((float)A/B);
		
	}

}
