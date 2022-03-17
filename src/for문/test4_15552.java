package for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
// 예외처리 (입력받는게 꼭 String 타입이어야 하기 떄문에)
import java.io.IOException;

public class test4_15552 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		// BufferReader 불러오기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferWriter 불러오기
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는것 불러오기 br.readLine이 String이기 때문에 int로 형변환
		int T = Integer.parseInt(br.readLine());
		
		// Read한 데이터가 Line단위로만 나눠지기 때문에 공백단위로 데이터를 가공하기 위해 메소드 호출
		StringTokenizer st;
		
		for(int i = 0; i < T; i++) {
			// 입력받은 내용을 공백단위로 나누게 읽기!
			st = new StringTokenizer(br.readLine());
			// st를 통해 나뉘어진 것들을 int형으로 바꾸어서 더해서 출력하기 + 라인 바꾸기
			bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())) + "\n");
		}
		
		// for문 끝나면 출력하는 것 끝내기.
		bw.close();
	}

}
