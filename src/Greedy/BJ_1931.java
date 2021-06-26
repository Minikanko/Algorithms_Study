package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BJ_1931 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		List<int[]> list = new ArrayList<int[]>();
		int result = 0;
		scan.nextLine();
		while (N-- > 0) {
			String[] str = scan.nextLine().split(" ");
			int[] nums = new int[2];
			nums[0] = Integer.parseInt(str[0]);
			nums[1] = Integer.parseInt(str[1]);
			list.add(nums);
		}

		Collections.sort(list, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1]) {
					return o1[0]-o2[0];
				}
				return o1[1] - o2[1];
			}
		});

		
		int lastTime = list.get(0)[1];
		for (int i = 1; i < list.size(); i++) {
			if (lastTime <= list.get(i)[0]) {
				result++;
				lastTime = list.get(i)[1];
			}
		}
		System.out.println(result+1);
	}

}
