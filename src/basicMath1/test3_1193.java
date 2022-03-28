package basicMath1;

import java.util.Scanner;

public class test3_1193 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a = 1;
		int b = 1;
		int now = 1;
		boolean check = false;
		
		while(true) {
			if(now == n) {
				System.out.println(a + "/" + b);
				break;
			}else {
				if(a == 1 && !check) {
					b++;
					now++;
					check = true;
				}else if(b != 1 && check) {
					b--;
					a++;
					now++;
				}else if(b == 1 && check) {
					a++;
					now++;
					check = false;
				}else if(a != 0 && !check) {
					b++;
					a--;
					now++;
				}
				
			}
		}

	}

}
