package Greedy;

import java.util.Scanner;
/*
 * 곱하기 혹은 더하기
 * 
 * 문제)
 * 각 자리가 숫자(0~9)로만 이루어진 문자열 S가 주어졌을 때, 
 * 왼쪽부터 오른쪽으로 하나씩 모든 숫자를 확인하며 숫자사이에 곱하기 또는 더하기 연산자를 넣어 결과적으로 
 * 만들어질 수 있는 가장 큰 수를 구하는 프로그램을 구하시오
 * 
 * 최적의 해인 이유:
 * 2이상의 숫자부터는 더하기 보다 곱하기를 할때 큰수를 만들 수 있기 때문이다.
 * 
 */
public class AddOrMultiple {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		int result = Integer.parseInt(s.charAt(0)+"");
		
		for(int i =1;i<s.length();i++) {
			if(s.charAt(i)=='0'||s.charAt(i)=='1'||result==0) {
				result+=Integer.parseInt(s.charAt(i)+"");
			}
			else
				result*=Integer.parseInt(s.charAt(i)+"");
		}
		System.out.println(result);
	}

}
