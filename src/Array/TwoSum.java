package Array;

import java.util.HashMap;
import java.util.Map;


/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {5,8,5,2};
        int target =10;
        TwoSum a = new TwoSum();
        int[]  result = a.solve(nums, target);
        for(int i : result)
        	System.out.println(i);
	}
	
	
	public int[] solve(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		int[] result = new int[2];
		for(int i=0; i<nums.length; i++) {
			//같은숫자는 재사용할수없다는 전제조건을 표시
			if(map.containsKey(nums[i])&&target-nums[i]!=nums[i]){
				int mapValue = map.get(nums[i]); 
				result[0]  = mapValue +1; 
			    result[1]  = i+1 ;        
				
			}else {
				map.put(target-nums[i], i); 
			}
		}
		
		
		return result;
		
	}

}
