package Basic;

import java.util.Scanner;

public class BJ_1629 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		System.out.println(recul(A,B,C));
	}
	
	public static long recul(int num,int b,int c) {
		if(b==1) return num%c;
		System.out.println("recul(num,b/2,c) 호출 전: "+num+" "+b+" "+c);
		long temp = recul(num,b/2,c);
		System.out.println("recul(num,b/2,c) 호출 후: "+num+" "+b+" "+c);
		if(b%2==0) {
			System.out.println("temp*temp%c : "+temp);
			return temp*temp%c;
		}
		else {
			System.out.println("(temp*temp%c)*(num%c) : "+ temp);
			return (temp*temp%c)*num%c;
		}
	}
}


