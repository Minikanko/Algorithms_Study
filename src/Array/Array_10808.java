package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array_10808 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] result = new int[26];
		
		for(int i =0;i<str.length();i++) {
			int index = str.charAt(i)-97;
			result[index]++;
		}
		Arrays.stream(result).forEach(x->System.out.print(x+" "));
	}

}
