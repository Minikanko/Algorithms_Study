package BJ;

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
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<Integer>();
		int count = 0;		//stack에 넣는 숫자
		int size = Integer.parseInt(br.readLine());
		stack.push(0);		//임의의 값
		int inputCount=0;	//사용자가 몇번 입력했는지
		while (true) {
			int inputNum = Integer.parseInt(br.readLine());
			// 사용자가 입력한 숫자가 count 보다 작은경우
			while (count < inputNum) {
				stack.push(++count);
				bw.write("+\n");
			}
			// peek랑 num이랑 같은 경우 빼줌
			while (stack.peek() == inputNum) {
				stack.pop();
				bw.write("-\n");
			}
			//사용자로부터 한번 입력받았으니깐 더하기
			inputCount++;
			//사용자가 입력한 횟수와 숫자의 크기가 같은 경우 제거
			if(inputCount==size) break;
		}
		if(stack.size()!=1) {
			System.out.println("NO");
		}
		else {
			bw.flush();
		}
			

	}
}
