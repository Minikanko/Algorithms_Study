package Basic;

import java.util.Scanner;

public class BJ_2443 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for(int i = 0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(j<i) System.out.print(" ");
				else System.out.print("*");
			}
			for(int j=N-2;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
