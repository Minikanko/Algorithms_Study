package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array_1919 {
	
	static int count=0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] alpha = new int[26];
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		for(char c : str1.toCharArray()) {
			alpha[c-97]++;
		}
		
		for(char c : str2.toCharArray()) {
			alpha[c-97]--;
		}
		
		//str1 과 str2 문자열의 차집합을 찾아서 그 문자들의 개수를 합한다.
		Arrays.stream(alpha).forEach(x->{
			if(x!=0) count+=Math.abs(x);
		});
		

		System.out.println(count);
		
	}

}
