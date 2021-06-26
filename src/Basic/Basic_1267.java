package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basic_1267 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int y = 0;
		int m = 0;
		for(int i=0;i<N;i++) {
			y +=yPay(Integer.parseInt(str[i]));
			m += mPay(Integer.parseInt(str[i]));
		}
		if(y==m) System.out.println("Y M "+y);
		else System.out.println(y>m?"M "+m:"Y "+y);
	}
	
	public static int yPay(int sec) {
		return ((sec/30)+1)*10;
	}
	
	public static int mPay(int sec) {
		return ((sec/60)+1)*15;
	}
	
}
