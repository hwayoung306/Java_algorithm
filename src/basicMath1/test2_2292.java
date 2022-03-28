package basicMath1;

import java.util.Scanner;

public class test2_2292 {

	public static void main(String[] args) {
		// 1 -> 6 ->

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a = 0; //Â÷¼ö
		int sum = 1;
		while(true) {
			if(n == 1) {
				System.out.println("1");
				break;
			}
			
			if(n <= sum) {
				System.out.println(a+1);
				break;
			}
			
			a++;
			
			for(int i = 0; i < a; i++) {
				sum += 6;
			}
		}
			}

}
