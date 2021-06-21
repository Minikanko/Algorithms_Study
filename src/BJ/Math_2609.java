package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math_2609 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int[] nums = new int[2];
		
		nums[0]= Integer.parseInt(str[0]);
		nums[1]= Integer.parseInt(str[1]);
		int index=1;
		int maxNum = 1;
		int minNum = 1; 
		
		while(Math.min(nums[0], nums[1]) >= index) {
			if(nums[0]%index==0 && nums[1]%index==0) {
				maxNum=index;
			}
			index++;
		}
		
		minNum = (nums[0]/maxNum) *(nums[1]/maxNum) * maxNum;
		System.out.println(maxNum);
		System.out.println(minNum);
	}

}
