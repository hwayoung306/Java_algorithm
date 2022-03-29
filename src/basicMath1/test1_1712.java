package basicMath1;

import java.util.Scanner;

public class test1_1712 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); 
		int b = sc.nextInt(); 
		int c = sc.nextInt(); 
		
		int result = 0; 
		
		if(b>= c) {
			System.out.println("-1");
		}else {
			System.out.println((a/(c-b))+1);
		}
		
	}

}
