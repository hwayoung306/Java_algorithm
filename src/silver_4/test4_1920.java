package silver_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test4_1920 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < m; i++) {
			int a = Integer.parseInt(st.nextToken());
			int result = 0;
			int mid_index = n / 2;

			if (a >= arr[mid_index]) {
				for (int j = mid_index; j < arr.length; j++) {
					if (a == arr[j]) {
						result = 1;
						break;
					}
				}
			} else {
				for (int j = mid_index - 1; j >= 0; j--) {
					if (a == arr[j]) {
						result = 1;
						break;
					}
				}
			}
			bw.write(Integer.toString(result));
			bw.newLine();
		}

		br.close();
		bw.close();

	}

}
