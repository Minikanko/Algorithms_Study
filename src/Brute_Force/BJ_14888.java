package Brute_Force;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_14888 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int[] nums = new int[N];
		scan.nextLine();
		
		String[] temp = scan.nextLine().split(" ");
		for(int i=0;i<N;i++) {
			nums[i] =Integer.parseInt(temp[i]);
		}
		
		int[] mathType = new int[4];
		String[] tempMath = scan.nextLine().split(" ");
		
		for(int i=0;i<N;i++) {
			mathType[i] =Integer.parseInt(tempMath[i]);
		}
		//덧셈 , 뺄셈, 곱셈, 나눗셈
		
		Arrays.sort(nums); //숫자 정렬
		
		for(int i=N-1;i>=0;i--) {
			
		}
		
		
	}

}
