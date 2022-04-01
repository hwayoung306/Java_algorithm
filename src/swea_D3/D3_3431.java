package swea_D3;

import java.util.Scanner;

class D3_3431
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();


		for(int test_case = 1; test_case <= T; test_case++)
		{
			int L = sc.nextInt(); // 최소 시간
			int U = sc.nextInt(); // 최대 시간
			int X = sc.nextInt(); // 운동 한 시간
			
			int result = 0;
			if(X < L) {
				result = L - X;
			}else if(U < X) {
				result = -1;
			}
			System.out.println("#" + (test_case+1) + " "+ result);
		

		}
	}
}