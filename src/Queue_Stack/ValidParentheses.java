package Queue_Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String exp="{(){}}";
		System.out.println(isValid(exp));
	}

	private static boolean isValid(String exp) {
		Stack<String> stack = new Stack<String>();
		boolean result = true;
		Map<String,String> map = new HashMap<>();
		map.put("(", ")");
		map.put("{", "}");
		map.put("[", "]");
		for(String s:exp.split("")) {
			if(map.containsKey(s)) {
				stack.push(s);
			}
			else if(map.containsValue(s)){
					if(!s.equals(map.get(stack.pop()))){
						result=false;
						return result;
					}
			}
		}
		/*
		 * 1번 코딩
		 
		for(String s: exp.split("")) {
			if(s.equals("(")||s.equals("{")||s.equals("[")) {
				stack.push(s);
			}
			else {
				if(s.equals(")")) {
					if(!stack.pop().equals("(")) {
						result =false;
						break;
					}
				}
				else if(s.equals("}")) {
					if(!stack.pop().equals("{")) {
						result =false;
						break;
					}
				}
				if(s.equals("]")) {
					if(!stack.pop().equals("[")) {
						result =false;
						break;
					}
				}
			}
		}
		*/
		return result;
	}
}
