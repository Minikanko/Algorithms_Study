package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Basic_2752 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int[] intStr = new int[3];
		for(int i=0;i<str.length;i++) {
			intStr[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(intStr);
		for(int i=0;i<3;i++) {
			System.out.println(intStr[i]);
		}
	}
}
