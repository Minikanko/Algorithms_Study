package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_1439 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char beforeTemp = s.charAt(0);
		int[] count = new int[2];
		
		for(int i=1;i<s.length();i++) {
			if(beforeTemp != s.charAt(i)) {
				count[Integer.parseInt(beforeTemp+"")]++;
				beforeTemp = s.charAt(i);
			}
				
		}
		count[Integer.parseInt(s.charAt(s.length()-1)+"")]++;
		int result = Math.min(count[0], count[1]);
		
		
//		String[] zero = s.split("0");
//		String[] one = s.split("1");

//		int count = 0;
//		if(zero.length>=one.length) {//1의 개수가 적다는 뜻
//			for(int i=0;i<zero.length;i++) {
//				if(zero[i].contains("1"))
//					count++;
//			}
//		}
//		else {
//			for(int i=0;i<one.length;i++) {
//				if(one[i].contains("0"))
//					count++;
//			}
//		}
		System.out.println(result);
	}
}
