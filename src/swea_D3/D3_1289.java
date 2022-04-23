package swea_D3;

import java.util.Scanner;

public class D3_1289 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		char b[] = new char[50];
		
		
		for(int i = 0; i<t;i++) {
			for(int j =0; j < b.length; j++) { // 초기화
				b[j] = '0';
			}
			
			String bit = sc.next();
			char[] a = bit.toCharArray();
			int count = 0;
			for(int j =0; j <a.length;j++) {
				if(a[j] == b[j]) {
					continue;
				}else {
					count += 1;
					for(int k =j; k < a.length; k++) {
						b[k] = a[j];
					}
				}
			}
			System.out.println("#"+(i+1)+" "+ count);
		}
	}

}
