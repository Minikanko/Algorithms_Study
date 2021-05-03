package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basic_2442 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for(int i=0;i<N;i++) {
			for(int j=0;j<2*N;j++) {
				if(j<N-i) System.out.print(" ");
				else if((N-i)+2*i-1 == j) break;
				else if(j>=i) System.out.print("*");
			}
			System.out.println();
		}
	}
}
