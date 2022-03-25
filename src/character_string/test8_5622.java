package character_string;

import java.util.Scanner;

public class test8_5622 {

	public static void main(String[] args) {
		// 1 = 2, 2=3. 3=4
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		int result = 0;
		
		for(int i = 0; i<a.length();i++) {
			result += changeNumber(a.charAt(i));
		}
		
		System.out.println(result);

		
		
	}

	private static int changeNumber(char charAt) {
		
		int c = charAt;
		int num = 0;
		
		if(c <= 67) { //abc
			num = 3;
		}else if( c <= 70) {//def
			num = 4;
		}else if(c <= 73) {//ghi
			num = 5;
		}else if(c <= 76) { //jkl
			num = 6;
		}else if(c <= 79) { //mno
			num = 7;
		}else if(c <= 83) { //pqrs
			num = 8;
		}else if(c <= 86) { //tuv
			num = 9;
		}else if( c<= 90) { // wxyz
			num = 10;
		}
		return num;
	}

}
