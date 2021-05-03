package Array;

public class TrappingRainWater {

	public static void main(String[] args) {
		int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(nums));
	}

	private static int trap(int[] nums) {
		//왼쪽 벽의 높이
		int[] left= new int[nums.length];
		//오른쪽 벽의 높이
		int[] right= new int[nums.length];
		int leftMax=nums[0];
		int rightMax=nums[nums.length-1];
		int result=0;
		for(int i=0;i<nums.length;i++) {
			if(leftMax<nums[i])
				leftMax=nums[i];
			if(rightMax<nums[nums.length-i-1]) {
				rightMax=nums[nums.length-i-1];
			}
			left[i]=leftMax;
			right[nums.length-i-1]=rightMax;
		}
		for(int i=0;i<nums.length;i++) {
			result+=Math.min(left[i], right[i])-nums[i];
		}
		
		return result; 
	}

}


