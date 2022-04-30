package swea_D3;

import java.util.Scanner;

public class D3_10505 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 1; i <= t; i++) {
			int tt = sc.nextInt();
			int [] arr = new int[tt];
			int result = 0;
			int sum = 0;
			for(int j =0; j<tt; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			
			sum= sum/tt;
			for(int j =0; j<tt;j++) {
				if(arr[j]<= sum) {
					result += 1;
				}
			}
			
			System.out.println("#"+i+" "+result);
		}

	}

}
