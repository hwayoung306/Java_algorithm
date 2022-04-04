package basicMath2;

import java.util.Scanner;

public class test7_1085 {

	public static void main(String[] args) {
		
		// (x,y) 

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int h_y = h-y;
		int w_x = w-x;
		
		int[] arr = new int[4];
		arr[0] = x;
		arr[1] = y;
		arr[2] = h_y;
		arr[3] = w_x;

		int shortest = arr[0];
		
		for(int i = 1; i < 4; i++) {
			if(shortest > arr[i]) {
				shortest = arr[i];
			}
		}
		
		System.out.println(shortest);
	}

}
