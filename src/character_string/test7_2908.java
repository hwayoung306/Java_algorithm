package character_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test7_2908 {

	public static void main(String[] args) throws IOException  {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int a = change(st.nextToken());
	int b = change(st.nextToken());
	
	System.out.println(Math.max(a,b));	
	
	}

	private static int change(String nextToken) {
		
		char[] c = nextToken.toCharArray();
		char temp = c[2];
		c[2] = c[0];
		c[0] = temp;
		String change = String.valueOf(c);
		return Integer.parseInt(change);
	}
}
