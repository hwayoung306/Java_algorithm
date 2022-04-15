package silver_4;

import java.util.Scanner;

public class test3_12927 {

	public static void main(String[] args) {
		// 전구 N개 -> 일렬 / 꺼지거나 켜져있다
		// 모든 전구를 끌껀데 스위치 N개을 가지고있고 해당 번호와 연결됨
		// 현재 전구의 상태가 주어졌을 때 전구를 끄기위해 스위치를 몇번을 눌러야 하는지

		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		char[] arr = new char[N.length() + 1];

		for (int i = 1; i < arr.length; i++) {
			arr[i] = N.charAt(i - 1);
		}

		int count = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == 'N') {
				continue;
			}
			for (int j = i; j < arr.length; j += i) {
				if (arr[j] == 'N') {
					arr[j] = 'Y';
				} else if(arr[j] == 'Y'){
					arr[j] = 'N';
				}
			}
			count++;
		}
		
		
		for(int i = 1; i <arr.length;i++) {
			if(arr[i] == 'Y') {
				count = -1;
				break;
			}
		}

		
		System.out.println(count);

	}
}
