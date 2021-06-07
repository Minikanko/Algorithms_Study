package BJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_10845 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<Integer>();
		int num = 0;
		while(N-- > 0) {
			String[] com = br.readLine().split(" ");
			
			switch(com[0]) {
			case "pop":
				System.out.println(q.isEmpty()?-1:q.poll());
				break;
			case "push":
				num = Integer.parseInt(com[1]);
				q.add(num);
				break;
			case "front":
				System.out.println(q.isEmpty()?-1:q.peek());
			break;
				
			case "size":
				System.out.println(q.size());
				break;
			case "empty":
				System.out.println(q.isEmpty()?1:0);
				break;
			case "back":
				System.out.println(q.isEmpty()?-1:num);
				break;
			}
		}
	}

}
