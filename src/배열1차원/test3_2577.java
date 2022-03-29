package 배열1차원;

import java.util.Scanner;

public class test3_2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = a*b*c;
		int[] arr = {0,0,0,0,0,0,0,0,0,0};
		int d = 10; //���� ��
		int e = 0; //��
		int f = 0; //������
		
		while(true) {
			f = result % 10; //�����ڸ�
			e = result / 10; //�����ڸ��� �A ��
			result = e;
					
			for(int i = 0; i < arr.length; i ++) {
				if(f == i) {
					arr[i] += 1;
				}
			}
			
			if(e == 0) {
				break;
			}
		}
		
		for(int i = 0; i < arr.length; i ++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
