package BJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Array_11328 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());
		int[] index = new int[26];
		boolean result=true;
		while(count-- > 0) {
			String[] str = br.readLine().split(" ");
			
			for(char c : str[0].toCharArray()) {
				index[c-97]++;
			}
			for(char c: str[1].toCharArray()) {
				index[c-97]--;
			}
			result = Arrays.stream(index).allMatch(x->x==0);
			bw.append(result?"Possible\n":"Impossible\n");
			for(int i=0;i<index.length;i++)
				index[i]=0;
		}
		bw.flush();
	}
}
