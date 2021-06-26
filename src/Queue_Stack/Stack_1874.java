package Queue_Stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.Stack;

public class Stack_1874 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		int size = Integer.parseInt(br.readLine());
		
		
		int start=0;
		
		while(size-- > 0) {
			
			
			int value = Integer.parseInt(br.readLine());
			
			
			if(start<value) {
				for(int i=start+1;i<=value;i++) {
					stack.push(i);
					sb.append("+\n");
				}
				start = value;
			}
			
			else if(stack.peek()!=value) {
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			sb.append("-\n");
			
		}
		
		
		System.out.println(sb.toString());
		
			

	}
}
