package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Stack;

public class Basic_2576 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<7;i++) {
			int inputNum = Integer.parseInt(br.readLine());
			if(inputNum%2==1) {
				min = Math.min(min, inputNum);
				sum+=inputNum;
			}
			
		}
		if(sum==0)
			System.out.println("-1");
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
