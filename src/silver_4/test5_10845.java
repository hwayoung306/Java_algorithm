package silver_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class test5_10845 {

	static int[] q;
	static int index = -1; // 현재 마지막 값의 위치

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		q = new int[n];

		StringTokenizer st;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String value = st.nextToken();
			
			if (value.equals("push") ) {
				int a = Integer.parseInt(st.nextToken());
				push(a);
			} else if (value.equals("pop")) {
				bw.write(Integer.toString(pop()));
				bw.newLine();
			} else if (value.equals("size")) {
				bw.write(Integer.toString(index + 1));
				bw.newLine();
			} else if (value.equals("empty")) { //
				bw.write(Integer.toString(empty()));
				bw.newLine();
			} else if (value.equals("front")) {	
				bw.write(Integer.toString(front()));
				bw.newLine();
			} else if(value.equals("back")){
				bw.write(Integer.toString(back()));
				bw.newLine();
			}

		}

		br.close();
		bw.close();

	}

	private static int back() {
		if(index == -1) {
			return -1;
		}else {
			return q[index];
		}

	}

	private static int front() {
		if (index == -1) {
			return -1;
		} else {
			return q[0];
		}

	}

	private static int empty() {
		if (index == -1) {
			return 1;
		} else {
			return 0;
		}
	}

	private static int pop() {
		if (index == -1) {
			return index;
		} else {
			int a = q[0];
			outq();
			index -= 1;
			return a;
		}

	}

	private static void outq() { // 큐에서 값이 나왔을 때 재 정렬 해주는

		if (index == 0) {
			q[0] = 0;
		} else {
			for (int i = 0; i < index; i++) {
				q[i] = q[i + 1];
				q[i + 1] = 0;
			}
		}
	}

	private static void push(int input) {
		q[index + 1] = input;
		index++;
	}

}
