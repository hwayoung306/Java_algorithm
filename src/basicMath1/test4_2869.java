package basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test4_2869 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken()); // up
		int b = Integer.parseInt(st.nextToken()); // down
		int c = Integer.parseInt(st.nextToken()); // 길이
		
		int day = (c-b)/(a-b);
		
		if((c-b)%(a-b) != 0) {
			day++;
		}

		System.out.println(day);
	}

}
