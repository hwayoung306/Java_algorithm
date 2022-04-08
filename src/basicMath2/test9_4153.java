package basicMath2;

import java.util.Scanner;

public class test9_4153 {

	public static void main(String[] args) {
		//  3, 4, 5
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			double a = Math.pow(sc.nextInt(), 2);
			double b = Math.pow(sc.nextInt(), 2);
			double c = Math.pow(sc.nextInt(), 2);
			
			if( a==0 && b==0 && c==0) {
				break;
			}
			
			double d = 0; // 길이가 긴 변의 제곱값
			double f = 0; // 길이가 짧은 변들의 제곱값의 합
			
			if(a > b && a >c) { // a가 제일 긴변일 경우
				d = a;
				f = b+c;
			}else if(b > a && b >c) { // b가 제일 긴변인 경우
				d = b;
				f = a+c;
			}else if(c>a && c>b) { // c가 제일 긴 변인경우
				d =c;
				f = a+b;
			}else {
				System.out.println("wrong");
			}
			
			if( d == f) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}
	}

}
