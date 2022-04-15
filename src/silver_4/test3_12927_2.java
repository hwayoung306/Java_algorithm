package silver_4;

import java.util.Scanner;

public class test3_12927_2 {

	public static void main(String[] args) {
		// 전구 N개 -> 일렬 / 꺼지거나 켜져있다
		// 모든 전구를 끌껀데 스위치 N개을 가지고있고 해당 번호와 연결됨
		// 현재 전구의 상태가 주어졌을 때 전구를 끄기위해 스위치를 몇번을 눌러야 하는지

		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		char[] arr = new char[N.length() + 1]; // 0은 사용하지 않을 거라 한칸 더 만들기
		int count = 0;
		int index = 1;

		for (int i = 1; i < arr.length; i++) { // arr에 글자 넣기, arr[0]은 제외하고 넣기
			arr[i] = N.charAt(i - 1);
//			System.out.println(arr[i]);
		}

		while (true) {
			boolean check = true; // 불이 다 꺼졌는지 확인하기 위해

			for (int i = 1; i < arr.length; i++) { // array를 돌면서 체크
				if (arr[i] == 'Y') { // 만약 켜진 불이 하나라도 있으면
					check = false; // check fasle
				}
			}

			if (check) { // 불이 다 꺼졌다면 끝
				break;
			} else { // 불이 켜진게 있는데 index가 넘어선다면? 끌 수 없는것
				if (index == arr.length) {
					count = -1;
					break;
				}
			}

			// 불이 다꺼지지 않았다면 다음 일을 수행
			if (arr[index] == 'Y') { // 만약 index번째 전구가 켜진 상태이면
				for (int i = 1; i * index < arr.length; i++) {
					if (arr[index * i] == 'Y') {
						arr[index * i] = 'F';
					} else {
						arr[index * i] = 'Y';
					}
				}
				count++;
			}
			index++;
		}
		System.out.println(count);
	}
}
