package 함수구현;

import java.util.Scanner;

public class test3_1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 99;
		
		if(n < 100) {
			count = n;
		}else {
			for(int i = 100; i <= n; i++){
				if(check(i)) {
					count += 1;
				};
			}
		}
		System.out.println(count);
		
	}
	
	public static boolean check(int n) {
		boolean check = false;
		int a = (n%10)-((n/10)%10); // 각 자릿수의 차

		while(n >= 10) { 
			if((n%10)-((n/10)%10) == a) {
				check = true;
				n /= 10;
			}else {
				check = false;
				break;
			}
		}
		
		return check;
	}

}
