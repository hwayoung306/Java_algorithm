package character_string;

import java.util.Scanner;

public class test10_1316 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;

		for(int i = 0; i < n; i++) {
			String b = sc.next();
			boolean check = check(b);
			if(check) {
				count++;
			}
		}
		
		System.out.println(count);

	}

	private static boolean check(String b) {
		
		char[] a = b.toCharArray();
		boolean[] c = new boolean[a.length];
		int k = 1;
		boolean result = true;
		c[a[0]-97] = true;
		
		for(int i = 1; i < a.length; i++) {
			if(a[i-1] != a[i]) {
				if(c[a[i]-97]) {
					result = false;
				}else{
					c[a[i]-97] = true;
				}
			}
		}
		
		return result;
	}

}
