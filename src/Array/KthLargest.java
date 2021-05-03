package Array;

import java.util.ArrayList;
import java.util.Comparator;
/*
 * Find the kth largest element in an unsorted array. 
 * Note that it is the kth largest element in the sorted order, not the kth distinct element. 
 * Example 1: 
 * Input: [3,2,1,5,6,4] and k = 2 
 * Output: 5 
 * Example 2: 
 * Input: [3,2,3,1,2,4,5,5,6] and k = 4 
 * Output: 4 
 * Note: You may assume k is always valid, 1 ≤ k ≤ array's length.
 */

public class KthLargest {
	public static void main(String[] args) {
		KthLargest a = new KthLargest();
		int[] nums = {3,2,1,5,6,4};
		int k =2;
		System.out.println(a.solve(nums , k));
	}
	//정렬하고고 K번째의 답을 꺼내주는 기능
	private int solve(int[] nums, int k) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i:nums) {
			list.add(i);
		}
		list.sort(comp);
		return list.get(k-1);

	}
	//오름차순
	Comparator<Integer> comp = new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2-o1;
		}
	};
}
