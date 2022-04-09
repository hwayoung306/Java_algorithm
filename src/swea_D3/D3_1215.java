package swea_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D3_1215 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = 10;
		// 테스트 케이스가 10번으로 정해졌으니 이 과정을 10번 반복
		for (int i = 1; i <= t; i++) {
			int length = Integer.parseInt(br.readLine()); // 찾을 글자의 길이
			char[][] arr = new char[8][8]; // 8x8 글자판 생성

			for (int j = 0; j < 8; j++) {
				arr[j] = br.readLine().toCharArray();
			}

			int count = 0; // 회문의 수

			if (length == 1) { // 전부 다 회문임
				count = 8 * 8;
			} else {

				for (int k = 0; k < 8; k++) { // 가로세로 8줄이니까!

					// 가로줄에서 회문 찾기
					for (int j = 0; j <= 8 - length; j++) {
						// 만약 length가 5라면 arr[k][0] ~ arr[k][3]에서 시작하는 것만 찾으면 됨
						// arr[k][4] 부터 5글자를 찾으면 arr[k][8]은 없으니까 오류!
						boolean check = true;
						int a = 0;

						while (check && a < length / 2) { // while 문은 돌면서 비교
							// 글자를 절반으로 나누어서 비교.
							// length가 짝수면 전부 다 비교하고, 홀수면 가운데 글자는 빼고 비교

							if (arr[k][j + a] != arr[k][j + (length - 1) - a]) { // (첫글자, 마지막글자), (두번째글자, 뒤에서
																					// 두번째글자)...비교했는데 다르면
								check = false; // false. false가 되면 다음 반복은 돌지 않음
							}
							a++;
						}

						if (check) { // 글자 앞뒤 비교 후 check가 true라면
							count++; // 회문 갯수 추가
						}
					}

					// 세로줄에서 회문 찾기
					for (int j = 0; j <= 8 - length; j++) { // 뒤에꺼
						boolean check = true;
						int a = 0;

						while (check && a < length / 2) { // while 문은 돌면서 비교
							// 글자를 절반으로 나누어서 비교.
							// length가 짝수면 전부 다 비교하고, 홀수면 가운데 글자는 빼고 비교

							if (arr[j + a][k] != arr[j + (length - 1) - a][k]) { // (첫글자, 마지막글자), (두번째글자, 뒤에서
																					// 두번째글자)...비교했는데 다르면
								check = false; // false. false가 되면 다음 반복은 돌지 않음
							}

							a++;
						}
						if (check) { // 글자 앞뒤 비교 후 check가 true라면
							count++; // 회문 갯수 추가
						}
					}

				}

			}

			System.out.println("#" + i + " " + count);
		}
	}

}
