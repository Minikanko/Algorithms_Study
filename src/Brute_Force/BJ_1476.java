package Brute_Force;

import java.util.Scanner;

public class BJ_1476 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int E = scan.nextInt();	//15
		int S = scan.nextInt();	//28
		int M = scan.nextInt(); //19
		int result = 1;
		int e=1,s=1,m=1;
		
		while(true) {
			if(e==E && S==s && M==m) break;
			if(E==1&&S==1&&M==1) break;
			e++;
			s++;
			m++;
			result++;
			
			if(e==16) e=1;
			if(s==29) s=1;
			if(m==20) m=1;
		}
		
		System.out.println(result);
		
	}
	
}
