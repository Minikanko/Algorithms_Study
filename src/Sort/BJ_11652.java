package Sort;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_11652 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long[] nums = new long[N];
		
		for(int i=0;i<N;i++) {
			nums[i]=scan.nextLong();
		}
		
		Arrays.sort(nums);
		long num = nums[0];
		long result = nums[0];
		int count = 1;
		int maxCount = 1;
		
		for(int i=1;i<N;i++){
			if(num==nums[i]) {
				count++;
			}
			
			else{
				count=1;
				num=nums[i];
			}
			if(maxCount<count){
				maxCount=count;
				result = num;
			}
		}
		System.out.println(result);
	}
}
