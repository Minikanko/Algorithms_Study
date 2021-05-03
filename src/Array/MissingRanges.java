package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingRanges {
	public static void main(String[] args) {

		int[] nums = {2,3,5,50,75};
		int lower=0, upper=99;
		System.out.println(solve(nums, lower, upper));
//		[0->1, 4, 6->49, 51->74, 76->99]
	}
	private static List<String> solve(int[] nums, int lower, int upper) {
		List<String> list = new ArrayList<String>();
		Arrays.sort(nums);
		int start = lower;
		for(int i:nums) {
			//start가 현재 값보다 큰경우
			if(i-start>=1) {
				if(i-start==1)
					list.add(""+start);
				else
					list.add(start+"->"+(i-1));
				start=i+1;
			}
			//start와 i값이 같은경우
			else if(i==start) {
				start=i+1;
			}
			//마지막 인자값
			if(i==nums[nums.length-1]) {
				if(upper-start!=1) {
					list.add(start+"->"+upper);
				}
				else {
					list.add(""+start);
				}
			}
		}
		return list;
	}
	
/*

	private static List<String> solve(int[] nums, int lower, int upper) {
		List<String> list = new ArrayList<String>();
		//내림차순 정렬
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++) {
			if(i==0&&lower<nums[0]) {
				list.add(lower+"->"+(nums[0]-1));
			}
			else if(nums[i]-nums[i-1]>1) {
				list.add((nums[i-1]+1)+"->"+(nums[i]-1));
			}
		}
		if(nums[nums.length-1]!=upper)
			list.add((nums[nums.length-1]+1)+"->"+upper);
		return list;
	}
*/
}
