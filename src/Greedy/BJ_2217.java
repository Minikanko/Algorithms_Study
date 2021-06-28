package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_2217 {
	public static void main(String[] args) {
		/*
		 * 2 10 15
		 */
		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		int[] nums = new int[K];
		for (int i = 0; i < K; i++) {
			int W = scan.nextInt();
			nums[i] = W;
		}
		Arrays.sort(nums);

		int result = 0;
//		for(int i=0;i<K-1;i++) {
//			if(nums[i]*(K-i)<= nums[K-1] && nums[i]*(K-i) >= nums[i+1]*(K-i-1)) {
//				result = nums[i]*(K-i);
//				
//			}
//		}

		for (int i = K - 1; i >= 0; i--) {
			result = Math.max(result, nums[i] * (K - i));

		}

		System.out.println(result);
	}
}
