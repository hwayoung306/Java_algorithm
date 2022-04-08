package basicMath2;

import java.util.Scanner;

public class test8_3009 {

	public static void main(String[] args) {
		// 세점이 주어졌을 때 축에 평행한 직사각형을 만들기 위해서 필요한 네번째 점을 찾
		// 세 점의 좌표가 한줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수

		Scanner sc = new Scanner(System.in);

		int[] x = new int[3];
		int[] y = new int[3];
		int rx = 0;
		int ry = 0;

		for (int i = 0; i < 3; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}

		if (x[0] == x[1]) {
			rx = x[2];
		} else if (x[0] == x[2]) {
			rx = x[1];
		} else {
			rx = x[0];
		}

		if (y[0] == y[1]) {
			ry = y[2];
		} else if (y[0] == y[2]) {
			ry = y[1];
		} else {
			ry = y[0];
		}
		
		System.out.println(rx + " " + ry);
	}

}
