package character_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test3_10809 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String a = bf.readLine();
		int[] arr = new int[26];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}

		for (int i = 0; i < a.length(); i++) {
			int b = a.charAt(i) - 97;
			
			if(arr[b] == -1) {
				arr[b] = i;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
