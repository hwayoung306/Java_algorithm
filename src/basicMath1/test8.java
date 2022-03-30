package basicMath1;

import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[] a = new char[10003];
		char[] b = new char[10003];
		int[] result = new int[10002]; // [1]번에 일의자리수부터 넣어서 거꾸로 넣을거임

		a = sc.next().toCharArray();
		b = sc.next().toCharArray();

		int short_l = 0; // 작은수
		int long_l = 0; // 큰수
		int temp = 0; // 반올림된 수
		char big; // a가 크니 b가 크니?
		int count = 0; // 자릿수

		if (a.length >= b.length) {
			long_l = a.length;
			short_l = b.length;
			big = 'a';
		} else {
			long_l = b.length;
			short_l = a.length;
			big = 'b';
		}

		for (int i = 1; i <= short_l; i++) {
			int a_num = a[a.length - i] - '0'; // a의 맨 뒷 숫자를 int로 바꾸기
			int b_num = b[b.length - i] - '0'; // b의 맨 뒷 숫자를 int로 바꾸기
			int sum = a_num + b_num + temp; // a의 맨 뒷숫자 + b의 맨 뒷숫자 + 반올림된수
			temp = 0;

			if (sum >= 10) { // 자릿수 합이 10이 넘는 경우
				temp = sum / 10; // 십의자리를 temp에 넣고
				sum = sum % 10; // sum에는 일의자리만 남겨둔다
			}

			result[i] = sum;
			count = i;
		}

		if (a.length == b.length) {
			result[count + 1] = temp;
			count = count + 1;
		} else {
			for (int i = 1; i <= (long_l - short_l); i++) {
				int a_num = 0;
				int sum = 0;
				if (big == 'a') {
					a_num = a[long_l - short_l - 1] - '0';
				} else if (big == 'b') {
					a_num = b[long_l - short_l - 1] - '0';
				}

				sum = a_num + temp;
				temp = 0;

				if (sum >= 10) {
					temp = sum / 10;
					sum = sum % 10;
				}

				result[count + i] = sum + '0';
				count = count + i;
			}
		}

		for (int i = count; i > 0; i--) {
			System.out.print(result[i]);
		}

	}

}
