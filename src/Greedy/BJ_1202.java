package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class jewelry{
	int weight;
	int price;
	
	public jewelry(int weight, int price) {
		super();
		this.weight = weight;
		this.price = price;
	}
}

public class BJ_1202 {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String[] nk = br.readLine().split(" ");
		 int N = Integer.parseInt(nk[0]);
		 int K = Integer.parseInt(nk[1]);
		 List<jewelry> list = new ArrayList<jewelry>();
		 int[] C = new int[K];
		 
		 for(int i =0;i<N;i++) {
			 String[] mv = br.readLine().split(" ");
			 list.add(new jewelry(Integer.parseInt(mv[0]), Integer.parseInt(mv[1])));
		 }
		 
		 //최대무게 입력
		 for(int i=0; i<K;i++) {
			 C[i] = Integer.parseInt(br.readLine());
		 }
		 
		 Arrays.sort(C);
		 
		 
		 Collections.sort(list, new Comparator<jewelry>() {
			@Override
			public int compare(jewelry o1, jewelry o2) {
				if(o1.weight==o2.weight) return o2.price-o1.price;
				return o1.weight-o2.weight;
			}
		});
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Comparator.reverseOrder());
		
		long result = 0;
		
		for(int i=0,j=0;i<K;i++) {
			while(j<N&&list.get(j).weight<=C[i]) {
				q.offer(list.get(j++).price);
			}
			
			if(!q.isEmpty()) {
				result+=q.poll();
			}
		}
		System.out.println(result);
		 
	}
}
