package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basic_10093 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		long x = Long.parseLong(str[0]);
		long y = Long.parseLong(str[1]);
		
//		long start = Math.min(x, y);
//		long end = Math.max(x, y);
		
		
		if(x==y)
			System.out.println(0);
		else if(x>y){
			System.out.println(x-y-1);
			for(long i=x+1;i<y;i++) {
				System.out.print(i+" ");
			}
		}
		else if(x<y){
			System.out.println(y-x-1);
			for(long i=x+1;i<y;i++) {
				System.out.print(i+" ");
			}
		}
		
	}
}
