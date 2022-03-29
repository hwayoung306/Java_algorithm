package for문;
import java.util.Scanner;

public class test11_10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int a [] = new int[n];
		
		//������ �ֱ�
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();			
		}
		
		//������ x���ϱ�
		for(int i =0;i<n; i++) {
			if(a[i] < x) {
				System.out.print(a[i] + " ");
			}
		}
		
	}

}
