package Array;

public class MaxSubArray {
	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(nums));
	}
	private static int maxSubArray(int[] nums) {
		int max=0;
		if(nums.length>0) {
			max = nums[0];
			int currentNum = nums[1];
			for(int i=1;i<nums.length;i++) {
				//현재 선택된 값(v1)과. 지금까지의 숫자들의 합과 현재 선택된값(v2)을 비교
				//만약 v2가 v1보다 작다면 현재값을 v1으로 변경한다.
				currentNum=Math.max(nums[i], currentNum+nums[i]);
				max=Math.max(currentNum, max);
			}
		}
		return max;
	}
}
