package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BJ_1931 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int[][] arrTime = new int[N][2];
		int result = 0;
		scan.nextLine();
		for(int i =0;i<N;i++) {
			String[] str = scan.nextLine().split(" ");
			arrTime[i][0] = Integer.parseInt(str[0]);
			arrTime[i][1] = Integer.parseInt(str[1]);
		}

		Arrays.sort(arrTime, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1]) {
					return o1[0]-o2[0];
				}
				return o1[1] - o2[1];
			}

			
		});
		
		int lastTime = 0;
		for (int i = 0; i < arrTime.length; i++) {
			if (lastTime <= arrTime[i][0]) {
				result++;
				lastTime = arrTime[i][1];
			}
		}
		System.out.println(result);
	}

}
