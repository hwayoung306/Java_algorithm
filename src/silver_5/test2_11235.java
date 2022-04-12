package silver_5;

import java.util.Arrays;
import java.util.Scanner;

public class test2_11235 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vote = sc.nextInt();
		String[] arr = new String[vote];
		int[] final_count = new int[vote];

		for (int i = 0; i < vote; i++) { // 표 넣기
			arr[i] = sc.next();
		}
		
		Arrays.sort(arr);
		
		for (int i = 0; i < vote; i++) { // 시작점
			int count = 1; // 자기 자신 세기
			if (arr[i].equals("")) { // 빈칸이면 다음칸으로 넘어가서 비교 대상 X
				continue;
			} else {
				for (int j = 1; j <= (vote - 1 - i); j++) { // 칸에 표가 들어있으면 비교하기
					if (arr[i].equals(arr[i + j])) {
						count++;
						arr[i + j] = "";
					}
				}
			}
			final_count[i] = count;
		}
		
		int max = 0;
		for(int i = 0; i <vote; i++) { // 표 수 비교
			if(final_count[i] == 0) {
				continue;
			}else if(final_count[i] > max) {
				max = final_count[i];
			}
		}
		
		for(int i = 0; i <vote; i++) {
			if(final_count[i] == max) {
				System.out.println(arr[i]);
			}
		}

	}

}
