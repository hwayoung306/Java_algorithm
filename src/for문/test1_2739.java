package for문;

import java.util.Scanner;

public class test1_2739 {

	public static void main(String[] args) {
		
		//N을 입력 받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i < 10; ++i) {
			System.out.println(N + " " + "*" + " " + i + " " + "=" + " " + (N*i));
		}
	}
}
