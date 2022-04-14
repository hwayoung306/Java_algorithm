package swea_D3;

import java.util.Scanner;

public class D3_1217 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <11; i++) {
			int t = sc.nextInt();
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int result = involution(N,M);
			System.out.println("#"+t+" "+ result);
		}
		
	}

	private static int involution(int n, int m) {
		if(m == 1) {
			return n;
		}else {
			return n*involution(n,m-1);
		}
	}

}
