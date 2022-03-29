package for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
// ����ó�� (�Է¹޴°� �� String Ÿ���̾�� �ϱ� ������)
import java.io.IOException;

public class test4_15552 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		// BufferReader �ҷ�����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferWriter �ҷ�����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// �Է¹޴°� �ҷ����� br.readLine�� String�̱� ������ int�� ����ȯ
		int T = Integer.parseInt(br.readLine());
		
		// Read�� �����Ͱ� Line�����θ� �������� ������ ��������� �����͸� �����ϱ� ���� �޼ҵ� ȣ��
		StringTokenizer st;
		
		for(int i = 0; i < T; i++) {
			// �Է¹��� ������ ��������� ������ �б�!
			st = new StringTokenizer(br.readLine());
			// st�� ���� �������� �͵��� int������ �ٲپ ���ؼ� ����ϱ� + ���� �ٲٱ�
			bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())) + "\n");
		}
		
		// for�� ������ ����ϴ� �� ������.
		bw.close();
	}

}
