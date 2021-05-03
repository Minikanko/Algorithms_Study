package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_2164 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i=1;i<=N;i++) {
			q.offer(i);
		}
		
		while(N-- >1) {
			q.poll();
			q.add(q.poll());
		}
		System.out.println(q.poll());
	}
}