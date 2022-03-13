package if문;

import java.util.Scanner;

public class test6_2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 시간을 분단위로 주었을 때 요리가 끝나는 디지털 시각을 알려주는 디지털 시계
		
		// 첫줄에는 현재 시각이 나오고 현재시각은 시(24시간) 분이 정수로 빈칸을 사이에두고 
		// 순서대로 주어진다.
		// 두번째 줄에는 요리에 필요한 시간이 분단위로 주어진다.
		
		// 첫째 줄에 종료되는 시간은 시와 분을 공백을 사이에 두고 출력한다
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt(); //현재 시
		int m = sc.nextInt(); //현재 분
		int t = sc.nextInt(); //분단위로 주어진 요리하는데 걸리는 시간
		
		// 시간을 분으로 바꾼다.
		int all = (h*60) + m + t;
		
		// 분으로 바꾼 시간을 다시 시간과 분으로 바꾼다.
		h = all/60;
		m = all%60;
		
		if(h>= 24) {
			h -= 24;
		}
		
		System.out.println(h + " " + m);
		
	}

}
