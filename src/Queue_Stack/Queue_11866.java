package Queue_Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Queue_11866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		int index = 0;
		int count = 1;
		Queue<Integer> q = new LinkedList<Integer>();

		for (int i = 1; i <= N; i++) {
			q.offer(i);
		}
		sb.append("<");
		while (!q.isEmpty()) {
			if (count % K == 0) {
				if(q.size()==1)
					sb.append(q.poll()+">");
				else
					sb.append(q.poll()+", ");
				index++;
			} else {
				q.add(q.poll());
			}
			count++;
		}
		System.out.println(sb);
	}

}
