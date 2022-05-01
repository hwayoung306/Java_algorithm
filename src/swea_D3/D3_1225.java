package swea_D3;

import java.util.Scanner;

public class D3_1225 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for(int i =1; i<= 10; i++) {
			int  test_num = sc.nextInt();
			int[] arr = new int[8];
			for(int j =0;j<8;j++) {
				arr[j] = sc.nextInt();
			}
			
			int count = 1;
			
			while(true) {
				if(count == 6) {
					count = 1;
				}
				if((arr[0] - count) <0 ) {
					arr[0] = 0;
				}else {
					arr[0] -= count;
				}
				count++;
				int temp = arr[0];
				
				for(int j =0; j<7;j++) {
					arr[j]=arr[j+1];
				}
				arr[7]=temp;
				if(temp == 0) {
					break;
				}
			}
			

			System.out.print("#"+test_num);
			for(int j =0; j<8;j++) {
				System.out.print(" "+arr[j]);
			}
			System.out.println();
			
		}
	}

}
