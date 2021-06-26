package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_11047 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		 int N = Integer.parseInt(str[0]);
		 int K = Integer.parseInt(str[1]);
		 int result = 0;
		 
		 Stack<Integer> stack = new Stack<Integer>();
		 
		 while(N-- > 0)
			 stack.push(Integer.parseInt(br.readLine()));
		
		 while(!stack.isEmpty()) {
			 int money = stack.pop();
			 result+=K/money;
			 K%=money;
		 }
		 System.out.println(result);
	}

}
