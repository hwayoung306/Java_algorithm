package silver_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test2_9012 {

	static char [] arr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i =0;i<t;i++) {
			String data = br.readLine(); // 입력 받은 괄호 문자열
			arr = data.toCharArray(); // 입력 받은 문자열을 각각 나누어 배열에 넣음
			
			int check = 0;
			for(int j = arr.length-1 ;j>=0; j--) { // VPS인지 확인하기
				if(check == 0 && arr[j] == '(') {
					check = -1;
					break;
				}
				if(arr[j] == ')') {
					check +=1;
				}else if( arr[j] == '(') {
					check -=1;
				}
			}
			
			if(check == 0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}
