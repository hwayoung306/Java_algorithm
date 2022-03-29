package for문;

import java.util.Scanner;

public class test1_2739 {

	public static void main(String[] args) {
		
		//N�� �Է� ���� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i < 10; ++i) {
			System.out.println(N + " " + "*" + " " + i + " " + "=" + " " + (N*i));
		}
	}
}
