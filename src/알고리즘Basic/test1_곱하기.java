package �˰���Basic;

import java.util.Scanner;

public class test1_���ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int A = 0;
		int B = 0;
		
		int Check = sc.nextInt();
		if(Check>0) {
			A = Check;
		}
		
		int Check2 = sc.nextInt();
		if(Check2 < 10) {
			B = Check2;
		}
		
		System.out.println(A*B);
	}
}
