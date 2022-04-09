package swea_D3;

import java.util.Scanner;

public class D3_4406 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 1; i <= t; i++) {
			String word = sc.next();
			char[] arr = word.toCharArray();
			
			for(int j = 0 ; j<arr.length;j++) {
				if(arr[j] == 'a' || arr[j] == 'e' || arr[j] == 'i' || arr[j] == 'o' || arr[j] == 'u') {
					arr[j] = ' ';				}
			}
			
			System.out.print("#" + i +" ");
			for(int j = 0; j <arr.length;j++) {
				if(arr[j] == ' ') {
					continue;
				}else {
					System.out.print(arr[j]);
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
