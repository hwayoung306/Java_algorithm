package return_method;

import java.util.Scanner;

public class test1_10872 {

	public static void main(String[] args) {
		// N! 0N12
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int result = factorial(a);
		System.out.println(result);
	}

	public static int factorial(int a) {

		if (a == 0 || a==1) {
			return  1; 
		}else {
			System.out.println("a는? " + a);
			return  a * (factorial(a - 1));
		}
	}

}
