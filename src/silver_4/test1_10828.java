package silver_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class test1_10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		StringTokenizer st;
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String a = st.nextToken();
			if(a.equals("push")) {
				stack.push(Integer.parseInt(st.nextToken()));
			}else if(a.equals("pop")) {
				System.out.println(stack.empty()?-1:stack.pop());
			}else if(a.equals("size")) {
				System.out.println(stack.size());
			}else if(a.equals("empty")) {
				System.out.println(stack.empty()?1:0);
			}else if(a.equals("top")) {
				System.out.println(stack.empty()?-1:stack.peek());
			}
		}
			br.close();
	}

}
