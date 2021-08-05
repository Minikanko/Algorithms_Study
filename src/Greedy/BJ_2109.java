package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BJ_2109 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		List<int[]> list = new ArrayList<int[]>();
		
		//p,d 값 입력
		while(n-- > 0) {
			int[] pdValue = new int[2];
			pdValue[0] = scan.nextInt();
			pdValue[1] = scan.nextInt();
			list.add(pdValue);
		}
		
		//d 기준으로 정렬, 만약 d가 같다면 p기준으로 정렬
		Collections.sort(list,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0]==o2[0]) {
					return o2[1]-o1[1];
				}
				return o2[0]-o1[0];
			}
		});
		
		long result = 0;
		int maxDay = findMaxDay(list);
		boolean[] visited = new boolean[maxDay];
		
		for(int[] temp : list) {
			if(!visited[temp[1]-1]) {
				visited[temp[1]-1]=true;
				result+=temp[0];
			}
			else {
				for(int i=temp[1]-1;i>=0;i--) {
					if(!visited[i]) {
						visited[i]=true;
						result+=temp[0];
						break;
					}
				}
			}
		}
		System.out.println(result);
	}
	

	public static int findMaxDay(List<int[]> list) {
		int max = 0;
		for(int[] temp : list) {
			max = Math.max(temp[1], max);
		}
		return max;
	}
}
