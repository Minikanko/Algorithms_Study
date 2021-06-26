package Queue_Stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;

public class Stack_17298 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(br.readLine());
		int[] result = new int[size];
		Stack<Integer> stack = new Stack<Integer>();
		String[] inputStr = br.readLine().split(" ");
		
	
		int[] inputNum = Arrays.stream(inputStr).mapToInt(x->Integer.parseInt(x)).toArray();
		
		stack.push(0);
		
		for(int i=1;i<size;i++) {
			if(stack.isEmpty()) {
				stack.push(i);
			}
			while(!stack.isEmpty()&&inputNum[i]>inputNum[stack.peek()]) {
				result[stack.pop()]=inputNum[i];
			}
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			result[stack.pop()]=-1;
		}
		Arrays.stream(result).forEach(x->{
			try {
				bw.write(x+" ");
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		bw.write("\n");
		bw.flush();
	}
}
