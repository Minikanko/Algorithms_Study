package Queue_Stack;

import java.util.Scanner;
import java.util.Stack;

public class BJ_6198 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] building = new int[N];
		
		for(int i=0;i<N;i++) {
			building[i]=scan.nextInt();
		}
		long result =0;
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.add(building[0]);
		for(int i=1;i<N;i++) {
			if(stack.peek()>building[i]) {
				stack.add(building[i]);
				result+=stack.size()-1;
			}
			else {
				while(!stack.isEmpty()&&stack.peek()<=building[i])
					stack.pop();
				stack.add(building[i]);
				result+=stack.size()-1;
			}
		}
		System.out.println(result);
		
		
	}

}
