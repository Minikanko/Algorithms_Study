package Queue_Stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class Queue_18258 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] q = new int[N];
		int front = -1;
		int back = -1;

		while (N-- > 0) {
			String[] str = br.readLine().split(" ");

			switch (str[0]) {

			case "push":
				q[++back] = Integer.parseInt(str[1]);
				break;
			case "front":
				bw.write(back - front >= 0 ? q[front] + "" : -1 + "");
				bw.write("\n");
				break;
			case "pop":
				bw.write(back - front >= 0 ? q[front] + "" : -1 + "");
				front++;
				bw.write("\n");
				break;
			case "empty":
				bw.write(back - front >= 0 ? "0" : "1");
				bw.write("\n");
				break;
			case "back":
				bw.write(back - front > 0 ? q[back] + "" : -1 + "");
				bw.write("\n");
				break;
			case "size":
				bw.write(back - front + "");
				bw.write("\n");
				break;
			}
		}
		bw.flush();
	}

}

/*
 * 시간초과 public static void main(String[] args) throws NumberFormatException,
 * IOException { BufferedReader br = new BufferedReader(new
 * InputStreamReader(System.in)); StringBuilder sb = new StringBuilder(); int N
 * = Integer.parseInt(br.readLine()); Queue<Integer> q = new
 * LinkedList<Integer>();
 * 
 * while (N-- > 0) { String[] str = br.readLine().split(" ");
 * 
 * switch (str[0]) {
 * 
 * case "push": q.offer(Integer.parseInt(str[1])); break; case "front":
 * sb.append(q.isEmpty() ? "-1" : "" + q.peek()).append("\n"); break; case
 * "pop": sb.append(q.isEmpty() ? "-1" : "" + q.poll()).append("\n"); break;
 * case "empty": sb.append(q.isEmpty() ? "1" : "0").append("\n"); break; case
 * "back": sb.append(q.isEmpty() ? "-1" : q.stream().skip(q.size() -
 * 1).findFirst().get() + "").append("\n"); break; case "size":
 * sb.append(q.size() + ""); break; } } System.out.println(sb); }
 */
