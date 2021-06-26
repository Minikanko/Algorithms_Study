package DFS_BFS;

import java.beans.Visibility;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import sun.print.resources.serviceui;
import sun.swing.text.CountingPrintable;

public class RemoveInvalidParentheses2 {
	public static void main(String[] args) {
		String s = "(a)())()";
		RemoveInvalidParentheses2 a = new RemoveInvalidParentheses2();
		System.out.println(a.solve(s));
	}

	// bfs
	/*
	 * 1. 문자를 담을 곳 2. 적합성함수 3. 이미 검사한 문장니지 확인
	 */
	private List<String> solve(String s) {
		//결과
		List<String> result = new ArrayList<String>();
		//잘려진 문자
		Queue<String> q = new LinkedList<String>();
		//검사한 문자인지 확인
		Set<String> set = new HashSet<String>();
		q.add(s);
		set.add(s);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='('||s.charAt(i)!=')') continue;
			String str = s.substring(0,i)+s.substring(i+1);
			q.add(str);
			
		}
		while(!q.isEmpty()) {
			int size = q.size();
			for(int j=0;j<size;j++) {
				String n=q.poll();
				if(set.contains(n))
					continue;
				set.add(n);
				if(checking(n)){
					result.add(n);
				}
			}
			
		}
		return result;
		
	}
	

	// 유효성체크
	private boolean checking(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='(') count++;
			else if(str.charAt(i)==')') {
				count --;
				if(count<0) return false;
			}
		}
		return count==0;
	}
	
}
