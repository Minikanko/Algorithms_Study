package Graph;

import java.beans.Visibility;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import sun.print.resources.serviceui;

public class RemoveInvalidParentheses01 {
	public static void main(String[] args) {
		String s = "(a)())()";
		RemoveInvalidParentheses01 a = new RemoveInvalidParentheses01();
		System.out.println(a.solve(s));
	}

	// bfs
	/*
	 * 1. 문자를 담을 곳 2. 적합성함수 3. 이미 검사한 문장니지 확인
	 */
	private List<String> solve(String s) {
		List<String> list = new ArrayList<String>();
		// 문자 넣기
		Queue<String> q = new LinkedList<String>();
		// 검사한 문장인지 확인
		Set<String> checked = new HashSet<String>();

		q.add(s);
		checked.add(s);
		while (!q.isEmpty()) {
			int size = q.size();
			for (int j = 0; j < size; j++) {
				String str = q.poll();
				// 유효성검사후 맞다면 list에 추가
				if (checking(str)) {
					list.add(str);
				}
				
				if (size == 1) {
					for (int i = 0; i < s.length(); i++) {
						if (s.charAt(i) != '(' && s.charAt(i) != ')')
							continue;
						String n = s.substring(0, i);
						n += s.substring(i + 1);
						if (checked.contains(n))
							continue;
						q.add(n);
						checked.add(n);

					}
				}

			}

		}
		return list;
	}

	// 유효성체크
	private boolean checking(String str) {
		int count = 0;
		for (char c : str.toCharArray()) {
			if (c == '(')
				count++;
			else if (c == ')') {
				count--;
				if (count < 0)
					return false;
			}
		}
		return count==0;
	}
}
