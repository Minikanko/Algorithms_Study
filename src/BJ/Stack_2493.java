package BJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Stack_2493 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Integer> value = new Stack<Integer>();
		Stack<Integer> valueTemp = new Stack<Integer>();
		
		int count = Integer.parseInt(br.readLine());
		
		String[] str = br.readLine().split(" ");
		int[] intTemp = new int[count];
		
		
		for(int i=0;i<count;i++) {
			value.add(Integer.parseInt(str[i]));
		}
		
		while(!value.isEmpty()||!valueTemp.isEmpty()) {
			int num = value.pop();
			//레이저가 만난 탑의 번째수
			if(num<=value.peek()) {
				bw.write(value.size()+" ");
			}
			else {
				valueTemp.add(num);
			}
			
			
			
			
			
			
			
			
			if(!value.isEmpty()&&!index.isEmpty()) {
				while(num>=value.get(0)) {
					value.
					bw.write(index.get(0));
				}
			}
			
			index.add(i);			//index값 넣음
			
			value.add(intTemp[i]);	//값을 넣음
		}
		
	}

}
