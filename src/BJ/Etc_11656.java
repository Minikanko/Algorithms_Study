package BJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Etc_11656 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] strArr = new String[str.length()];
		
		for(int i=0;i<str.length();i++) {
			strArr[i] = str.substring(i);
		}
		
		Arrays.sort(strArr);
		Arrays.stream(strArr).forEach(x->System.out.println(x));
	}

}
