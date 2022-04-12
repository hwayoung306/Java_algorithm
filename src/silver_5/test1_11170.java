package silver_5;

import java.util.Scanner;

public class test1_11170 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int count = 0;
			
			for(int j = n; j <= m; j++) {
				int tmp = j;
				while(true) { // n 부터
					if(tmp%10 == 0) {
						count++;
					}
					tmp = tmp/10;
					if(tmp==0) {
						break;
					}
				}
			}
			
			System.out.println(count);
			
		}
	}

}
