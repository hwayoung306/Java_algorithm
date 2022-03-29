package if문;


import java.util.Scanner;

public class test5_2884 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt(); //45��

		M = M - 45;
		
		if(M < 0) {
			H = H - 1;
			M = 60 + M;
			if(H < 0) {
				H = 24 + H;
			}
		}
		
		System.out.println(H + " " + M);
	}

}
