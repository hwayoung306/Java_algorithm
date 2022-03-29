package character_string;

import java.util.Scanner;

public class test9_2941_sucess {
	static Scanner sc = new Scanner(System.in); 

	public static void main(String[] args) {

		int n = sc.nextInt();
		int count = 0; 

		for (int i = 0; i < n; i++) { 
			if (check() == true) { 
				count++;
			}
		}

		System.out.println(count);

	}

	private static boolean check() {
		boolean[] check = new boolean[26]; 
		int before = 0; 
		
		String s = sc.next();
		
		for (int i = 0; i < s.length(); i++) { 
			int now = s.charAt(i); 

			if (before != now) { 
				if (check[now - 'a'] == false) { 
					check[now - 'a'] = true; 
					before = now; 
				} else { 
					return false; 
				}
			} else { 
				continue;
			}
		}
		return true; 
	}

}
