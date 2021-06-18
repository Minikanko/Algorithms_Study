package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_11655 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder result = new StringBuilder();
		
		for(char c : str.toCharArray()) {
			if(c!=' ' && c>'9') {
				int a = (int)c+13;
				if(c>='a' && c<='z'&& a>122) {
					a-=26;
				}
				if(c>='A' && c<='Z' && a>90) {
					a-=26;
				}
				result.append((char)a);
			}
			else {
				result.append((char)c);
			}
			
		}
		System.out.println(result.toString());
	}

}
