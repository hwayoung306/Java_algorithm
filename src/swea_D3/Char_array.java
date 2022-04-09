package swea_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Char_array {

	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		
//		char[][] arr = new char[8][8];
//		
//		 for(int j=0;j<8;j++){
//             arr[j]=sc.next().toCharArray() ;
//         }
//		
//		sc.close();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[][] arr = new char[8][8];
		for(int j=0;j<8;j++){
          arr[j]=br.readLine().toCharArray();
      }
		
		for(int j =0; j <8; j++) {
			for(int i = 0; i <8; i++) {
				System.out.print(arr[j][i]);
			}
			System.out.println();
		}

	}

}
