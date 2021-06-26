package Queue_Stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Stack_2493 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<int[]> tops = new Stack<int[]>();

		int N = Integer.parseInt(br.readLine());

		String[] str = br.readLine().split(" ");


		for (int i = 0; i < N; i++) {
			int now = Integer.parseInt(str[i]);

			while (!tops.isEmpty() && tops.peek()[0]<now) {
				tops.pop();
			}
			String result = tops.isEmpty()?0+" ":tops.get(tops.size()-1)[1]+" ";
			bw.write(result);

			tops.push(new int[] {now,i+1});
		}
		bw.flush();

	}

}
