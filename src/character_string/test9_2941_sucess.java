package character_string;

import java.util.Scanner;

public class test9_2941_sucess {
	static Scanner sc = new Scanner(System.in); 
	// Scanner�� Main�� check �޼ҵ忡���� ���� ������ Static���� ����

	public static void main(String[] args) {

		int n = sc.nextInt(); //test case�� �Է�
		int count = 0; // �׷�ܾ��� ����

		for (int i = 0; i < n; i++) { // test case�� ���� ����
			if (check() == true) { //check �޼ҵ尡 true�� ���� -> check �޼ҵ�� �̵�
				count++;
			}
		}

		System.out.println(count);

	}

	private static boolean check() {
		boolean[] check = new boolean[26]; // ���ĺ� 26���� boolean �迭 ����� 
		int before = 0; 
		// �Էµ� �ܾ��� ���� ö�ڰ� �� �ڸ� �ܾ� -> chartAt()�� ���� �ƽ�Ű�ڵ�� ���� �Ǵϱ�
		// int �������� ����
		
		String s = sc.next();
		// �Է¹��� �ܾ�
		
		for (int i = 0; i < s.length(); i++) { // �ܾ ���� ����

			int now = s.charAt(i); // now�� ���� ���� �ֱ�

			if (before != now) { // ���� �ٷ� �� ���ڶ� ���� ���ڶ� ���� �ʴٸ�
				if (check[now - 'a'] == false) { // �׷��� check �迭 �� ���� ���ĺ��� ���� fasle��� -> ������ ���� ���ĺ��� �ƴ϶��!
					check[now - 'a'] = true; // ���� ���ĺ��� true�� �ٲٰ�
					before = now; // before�� ���� ���ĺ��� �ִ´�
				} else { // before != now�ε� ���� check�� true��� -> �̹� ������ ���Դ� ���ĺ��̶�� �Ŵϱ�
					return false; // �ٷ� flase�� return
				}
			} else { // �������ڿ� ���� ���ڰ� ���ٸ� ���� ���ư� ��� ���ϱ�
				continue;
			}
		}
		return true; // flase�� �������� �ʴ´ٸ� �׷�ܾ��� �Ҹ��� true�� �����Ѵ�.
	}

}
