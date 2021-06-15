package BJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sort_2750 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];
		
		for(int i=0;i<N;i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(nums);
		Arrays.stream(nums).forEach(x->System.out.println(x));
		
	}
}
