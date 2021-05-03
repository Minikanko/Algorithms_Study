package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Basic_2490 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = 0;
		while(N++ <3) {
			String[] str = br.readLine().split(" ");
			long count = Arrays.stream(str).filter(x->x.equals("1")).count();
			if(count==1) {
				sb.append("C\n");
			}
			else if(count==2) {
				sb.append("B\n");
			}
			else if(count==3) {
				sb.append("A\n");
			}
			else if(count==4) {
				sb.append("E\n");
			}
			else if(count==0) {
				sb.append("D\n");
			}
		}
		System.out.println(sb);
	}

}
