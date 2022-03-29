package 함수구현;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean check = false;
		int a = (n % 10) - ((n / 10) % 10); // �� �ڸ����� ��
		
		while (n != 0) {
			if ((n % 10) - ((n / 10) % 10) == a) {
				System.out.println("����");
				check = true;
				n /= 10;
			} else {
				check = false;
				break; 
			}
		}

	}

}
