package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		List<Integer> nums = new ArrayList<Integer>();
		
		for(int i=0;i<N;i++) {
			nums.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(nums);
		for(int num:nums) {
				sb.append(num).append('\n');
		}
		System.out.println(sb);
	}

}
