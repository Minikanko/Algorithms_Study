package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BJ_11000 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		List<int[]> list = new ArrayList<int[]>();
		
		while(N-- > 0) {
			int[] temp = new int[2];
			temp[0] = scan.nextInt();
			temp[1] = scan.nextInt();
			list.add(temp);
		}
		Collections.sort(list,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0]==o2[0]) return o1[1]-o2[1];
				else return o1[0]-o2[0];
			}
		});
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		
		q.add(list.get(0)[1]);
		
		for(int i=1;i<list.size();i++) {
			if(list.get(i)[0]>=q.peek()) q.poll();
			q.add(list.get(i)[1]);
		}
		System.out.println(q.size());
	}
}
