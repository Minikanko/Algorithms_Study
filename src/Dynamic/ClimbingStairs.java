package Dynamic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

/*
 * You are climbing a stair case. 
 * It takes n steps to reach to the top. 
 * Each time you can either climb 1 or 2 steps. 
 * In how many distinct ways can you climb to the top? 
 * Note: Given n will be a positive integer. 
 * Example 1:
 * Input: 2 
 * Output: 2 
 * Explanation: There are two ways to climb to the top. 
 * 1. 1 step + 1 step 
 * 2. 2 steps
 */


public class ClimbingStairs {
	public static void main(String[] args) {
		int n =5;
		System.out.println(climbStairs(n));
	}

	private static int climbStairs(int n) {
		int[] b = {1,2};
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(n);
		int count =0;
		while(!q.isEmpty()) {
			int a = q.poll();
			for(int i=0;i<b.length;i++) {
				int c = a-b[i];
				if(c>0)
					q.add(c);
				else if(c==0) count++;
			}
		}
		
		return count;
	}
}
