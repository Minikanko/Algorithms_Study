package BJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Etc_9093 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		while(N-- >0) {
			String[] strs = br.readLine().split(" ");
			Stack<Character> stack = new Stack<Character>();
			
			for(int i=0;i<strs.length;i++) {
				for(char c : strs[i].toCharArray()) {
					stack.push(c);
				}
				
				while(!stack.isEmpty()) {
					bw.write(stack.pop());
				}
				bw.write(" ");
			}
			bw.write("\n");
			
		}
		bw.flush();
		
		
	
		
	}
}
