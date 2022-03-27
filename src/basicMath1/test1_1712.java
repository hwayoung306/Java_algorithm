package basicMath1;

import java.util.Scanner;

public class test1_1712 {

	public static void main(String[] args) {
		// 임대료,  제산세, 보험료, 급여 = A만원의 고정비용
		// 1대의 노트북을 생산하는데 재료비 + 인건비 = B만원의 가변비용
		// ex) a=1000, b=70 일때 노트북 한대 생산하는데 총 = 1070만원이 들며,
		// 10대 생산하면 1000+700 = 1700만원이 든다
		// 노트북 가격이 C만원으로 책정되어있다고 하면
		// 일반적으로 생산 대수를 늘려 가다 보면 어느 순간 총 수입(판매비용)이 총 비용(고정비용+손익분기점)보다 많아지게 된다.
		// 최초로 총 수입이 비용보다 많아져서 이익이 발생하는 지점인 손익분기점을 구하시오
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // 고정비용
		int b = sc.nextInt(); // 가변비용 *노트북 갯수
		int c = sc.nextInt(); // 생산한 노트북의 1대 가격
		
		int result = 0; // 최초로 >0는 노트북 대수 // 없으면 -1 출력
		
		if(b>= c) {
			System.out.println("-1");
		}else {
			System.out.println((a/(c-b))+1);
		}
		
	}

}
