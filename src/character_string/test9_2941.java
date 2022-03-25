package character_string;
import java.util.Scanner;

public class test9_2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int  count = 0;
		String a = sc.next();
		
		for(int i = 0; i < a.length(); i++) {
			
			if(i == a.length()-1) {
				count++;
				break;
			}
			
			if(a.charAt(i) == 'c') {
				if(a.charAt(i+1) == '=' || a.charAt(i+1) == '-') {
					i++;
				}
			}
			
			if(a.charAt(i) == 'd') {
				if(a.charAt(i+1) == '-') {
					i++;
				}else if(i < a.length()-2) {
					if(a.charAt(i+1) == 'z' && a.charAt(i+2) == '=') {
						i += 2;
					}
				}
			}
			
			if(a.charAt(i) == 'l' || a.charAt(i) == 'n') {
				if(a.charAt(i+1) == 'j') {
					i++;
				}
			}
			
			if(a.charAt(i) == 's' || a.charAt(i) == 'z') {
				if(a.charAt(i+1) == '=') {
					i++;
				}
			}
			count++;			
		}
		
		System.out.println(count);

	}

}
