package basicMath2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class test4_1929 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// M이상 N이하의 소수들을 모두 출력하는 프로그램
		// 에라토스테네스의 체로 풀어보자 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		// 배열을 생성해서 초기화 하기
		int[] a = new int[1000001];
		for(int i = 2; i <= 1000000; i++) {
			a[i] = i;
		}
		
		// 2부터 시작해서 그 수의 배수에 해당하는 수를 모두 지우기
		// 지울 때 자기 자신은 지우지 않고, 이미 지워진 수는 건너 뛴다
		
		for(int i = 2; i <= 1000000; i++){
			if(a[i] == 0) { // 이미 지워진 숫자라면 건너 뛰기
				continue;
			}
			// 아니라면 그 배수부터 시작해서 숫자 지우기
			for(int j = 2*i; j <= 1000000; j += i) {
				a[j] = 0;
			}
		}
		
	
		for (int i = M; i <= N; i++) { // M이상 N이하
			if(a[i] != 0) {
				bw.append(Integer.toString(a[i])  + "\n" );
			}
		}
		
		br.close();
		bw.close();

	}

}
