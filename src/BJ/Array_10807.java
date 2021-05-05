package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array_10807 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		String goal = br.readLine();
		int result = 0;
		
		for(String s : str) {
			if(goal.equals(s))
				result++;
		}
		System.out.println(result);
	}

}
