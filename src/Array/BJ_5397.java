package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BJ_5397 {

	/*
	 * 길이가 L인 문자열 백스페이스 : - (글자지움) 화살표 : < , > (커서 움직임) 커서 위치가 줄의 마지막이 아니면 커서 및 커서
	 * 오른쪽에 있는 모든 문자는 오른쪽으로 한칸이동
	 *
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		while (N-- > 0) {
			String str = br.readLine();
			Stack<Character> left = new Stack<Character>();
			Stack<Character> right = new Stack<Character>();

			for (char c : str.toCharArray()) {
				switch (c) {
				case '-':
					if (!left.isEmpty())
						left.pop();
					break;

				case '<':
					if (!left.isEmpty())
						right.add(left.pop());
					break;

				case '>':
					if (!right.isEmpty())
						left.add(right.pop());
					break;

				default:
					left.add(c);
					break;
				}
			}
			while (!left.isEmpty()) {
				right.add(left.pop());
			}

			while (!right.isEmpty()) {
				bw.append(right.pop());
			}
			bw.append('\n');
			bw.flush();
		}

	}

}
