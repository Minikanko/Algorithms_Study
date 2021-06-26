package Queue_Stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Stack_4889 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = 0;
		
		while (true) {
			N++;
			int count = 0;
			String inputStr = br.readLine();
			
			Stack<Character> stack = new Stack<Character>();
			
			//종료되는 상황
			if (inputStr.contains("-")) break;

			for (Character c: inputStr.toCharArray()) {
				if(c == '{') {
					stack.push(c);
				}
				else {
					if(stack.isEmpty()) {
						count++;
						stack.push(c);
					}
						
					else if(stack.peek()=='{') {
						stack.pop();
					}
				}
			}
			
			bw.write(N + ". " + (count+stack.size()/2) +"\n");	
			
		}
		bw.flush();
	}

}
