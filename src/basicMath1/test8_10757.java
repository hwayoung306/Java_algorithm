package basicMath1;

import java.math.BigInteger;
import java.util.Scanner;

public class test8_10757 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		BigInteger a = new BigInteger(sc.next());
		BigInteger b = new BigInteger(sc.next());
		
		a = a.add(b);
		
		System.out.println(a);

	}
}
