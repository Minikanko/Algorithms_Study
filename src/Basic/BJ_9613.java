package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_9613 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
			long sum = 0;
			String[] str = br.readLine().split(" ");
			for(int i=1;i<str.length-1;i++) {
				for(int j=i+1;j<str.length;j++) {
					sum+=getGCD(Integer.parseInt(str[i]),Integer.parseInt(str[j]));
				}
			}
			System.out.println(sum);
		}
		
		
	}
	public static long getGCD(int num1, int num2) {
		if(num2==0)
			return num1;
		else
			return getGCD(num2,num1%num2);
	}

}
