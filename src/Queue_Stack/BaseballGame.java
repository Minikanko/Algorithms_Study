package Queue_Stack;

import java.util.Stack;

public class BaseballGame {

	public static void main(String[] args) {
		String[] strs = { "5", "-2", "4", "C", "D", "9", "+", "+" };
		System.out.println(calPoints(strs));
	}

	private static int calPoints(String[] strs) {
		Stack<Integer> stack = new Stack<Integer>();
		int sum=0;
		int point=0;
		for(String s: strs) {
			//C를 만나는 경우
			if(s.equals("C")) {
				point = stack.pop();
				sum-=point;
			}
			//D를 만나는 경우
			else if(s.equals("D")) {
				point=stack.peek()*2;
				stack.push(point);
				sum+=stack.peek();
			}
			//덧셈
			else if(s.equals("+")) {
				int peekPoint = stack.pop();
				point = peekPoint+stack.peek();
				stack.push(peekPoint);
				stack.push(point);
				sum+=point;
			}
			//그냥 점수일때
			else {
				point = Integer.parseInt(s);
				sum+=point;
				stack.push(point);
			}
		}
		return sum;
	}
}
