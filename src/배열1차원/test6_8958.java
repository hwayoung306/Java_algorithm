package 배열1차원;

import java.util.Scanner;

public class test6_8958 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] arr = new String[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();

		}

		int score = 1;
		
		for (int j = 0; j < arr.length; j++) {
			int total = 0;
			for (int i = 0; i < arr[j].length(); i++) {
				char a = arr[j].charAt(i);
				if(a == 'O') {
					total += score;
					score++;
				}else{
					score = 1;
				}
			}
			System.out.println(total);
			score = 1;
		}
	}

}
