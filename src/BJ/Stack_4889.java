package BJ;

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
		int count = 0;
		
		while (true) {
			count++;
			int result = 0;
			String[] inputStr = br.readLine().split("");
			Stack<String> stack = new Stack<String>();

			if (inputStr[0].equals("-"))
				break;

			for (String str : inputStr) {
				if (stack.isEmpty())
					stack.push(str);
				else if (stack.peek().equals("{") && str.equals("}")) {
					stack.pop();
				} 
				else {
					stack.push(str);
				}
			}
			while(!stack.isEmpty()) {
				String curStr = stack.pop();
				String beforeStr = stack.pop();
				if(beforeStr.equals(curStr)) {
					result++;
				}
				else result+=2;
			}
				
			bw.write(count + ". " + result +"\n");	
			
		}
		bw.flush();
	}

}
