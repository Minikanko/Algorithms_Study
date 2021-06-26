package Queue_Stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Stack_17413 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Stack<Character> stack = new Stack<Character>();
		while (true) {

			String inputStr = br.readLine();
			boolean flag = false;

			for (char c : inputStr.toCharArray()) {
				
				if (c == '<') {
					outInStack(stack,bw);
					flag = true;
					bw.write(c);
				}
				
				else if (c == ' ') {
					outInStack(stack,bw);
					bw.write(c);
				}
				else if (c == '>') {
					flag = false;
					bw.write(c);
				}
				
				else if (flag) {
					bw.write(c);
				} 

				else {
					stack.push(c);
				}
			}
			outInStack(stack,bw);
				
			bw.flush();
		}
	}
	
	public static void outInStack(Stack<Character> stack, BufferedWriter bw) throws IOException {
		while(!stack.isEmpty()) {
			bw.write(stack.pop());
		}
	}

}
