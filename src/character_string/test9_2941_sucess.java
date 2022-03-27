package character_string;

import java.util.Scanner;

public class test9_2941_sucess {
	static Scanner sc = new Scanner(System.in); 
	// Scanner를 Main과 check 메소드에서도 쓰기 때문에 Static으로 설정

	public static void main(String[] args) {

		int n = sc.nextInt(); //test case를 입력
		int count = 0; // 그룹단어의 갯수

		for (int i = 0; i < n; i++) { // test case의 갯수 동안
			if (check() == true) { //check 메소드가 true인 동안 -> check 메소드로 이동
				count++;
			}
		}

		System.out.println(count);

	}

	private static boolean check() {
		boolean[] check = new boolean[26]; // 알파벳 26개의 boolean 배열 만들기 
		int before = 0; 
		// 입력된 단어의 이전 철자가 들어갈 자리 단어 -> chartAt()을 통해 아스키코드로 변경 되니까
		// int 형식으로 받음
		
		String s = sc.next();
		// 입력받은 단어
		
		for (int i = 0; i < s.length(); i++) { // 단어가 끝날 동안

			int now = s.charAt(i); // now에 현재 문자 넣기

			if (before != now) { // 만약 바로 전 문자랑 지금 문자랑 같지 않다면
				if (check[now - 'a'] == false) { // 그런데 check 배열 중 현재 알파벳의 값이 fasle라면 -> 이전에 나온 알파벳이 아니라면!
					check[now - 'a'] = true; // 현재 알파벳을 true로 바꾸고
					before = now; // before에 현재 알파벳을 넣는다
				} else { // before != now인데 벌써 check가 true라면 -> 이미 이전에 나왔던 알파벳이라는 거니까
					return false; // 바로 flase를 return
				}
			} else { // 이전글자와 지금 글자가 같다면 위로 돌아가 계속 비교하기
				continue;
			}
		}
		return true; // flase를 리턴하지 않는다면 그룹단어라는 소리이 true를 리턴한다.
	}

}
