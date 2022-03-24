package 함수구현;

public class test2_4673 {

	public static int check(int n) {
		  
		int sum = n;
		while(n!=0) {
			sum += n%10;
			n /= 10;
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		boolean[] arr = new boolean[10001];
		for(int i = 1; i < 10001; i++) {
			int selfnum = check(i);
			if(selfnum <= 10000) {
				arr[selfnum] = true;
			}
		}
		for(int i=1; i <= 10000; i++) {
			if(!arr[i]) {
				System.out.println(i);
			}
		}

	}

}
