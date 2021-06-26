package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math_1934 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		
		while(N-- > 0) {
			String[] str = br.readLine().split(" ");
			int[] nums = new int[2];
			
			nums[0]= Integer.parseInt(str[0]);
			nums[1]= Integer.parseInt(str[1]);
			
			int gcd = reculGcd(nums[0],nums[1]);
			int lcm = nums[0]*nums[1]/gcd;
			
			System.out.println(lcm);
		}
		
		
	}
	
	public static int reculGcd(int num1,int num2) {
		if(num2==0) return num1;
		return reculGcd(num2,num1%num2);
	}

}

