package character_string;

import java.util.Scanner;

public class test2_11720 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String a = sc.next();
		int sum = 0;
		
		
		for(int i = 0; i < a.length(); i++) {
			sum += (int)a.charAt(i) - 48;
		}
		System.out.println(sum);
	}

}
