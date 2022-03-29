package if문;


import java.util.Scanner;

public class test6_2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �ð��� �д����� �־��� �� �丮�� ������ ������ �ð��� �˷��ִ� ������ �ð�
		
		// ù�ٿ��� ���� �ð��� ������ ����ð��� ��(24�ð�) ���� ������ ��ĭ�� ���̿��ΰ� 
		// ������� �־�����.
		// �ι�° �ٿ��� �丮�� �ʿ��� �ð��� �д����� �־�����.
		
		// ù° �ٿ� ����Ǵ� �ð��� �ÿ� ���� ������ ���̿� �ΰ� ����Ѵ�
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt(); //���� ��
		int m = sc.nextInt(); //���� ��
		int t = sc.nextInt(); //�д����� �־��� �丮�ϴµ� �ɸ��� �ð�
		
		// �ð��� ������ �ٲ۴�.
		int all = (h*60) + m + t;
		
		// ������ �ٲ� �ð��� �ٽ� �ð��� ������ �ٲ۴�.
		h = all/60;
		m = all%60;
		
		if(h>= 24) {
			h -= 24;
		}
		
		System.out.println(h + " " + m);
		
	}

}
