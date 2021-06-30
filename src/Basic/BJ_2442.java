package Basic;

import java.util.Scanner;

public class BJ_2442 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int i=0;i<N;i++) {
			for(int j=i;j<N-1;j++) {
				System.out.print(" ");
			}
			for(int z=0;z<(2*(i+1)-1);z++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
