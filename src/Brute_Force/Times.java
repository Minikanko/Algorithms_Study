package Brute_Force;

import java.util.Scanner;

/*
 * 시각
 * 
 * 문제)
 * 정수 N이 입력되면 00시 00분 00초부터 N시 59분 59초까지의 모든 시각 중에서 3이 하나라도 포함되는 모든 경우의 수를 구하는 프로그램을 작성하세요
 * 예를 들어 1을 입력했을 때 다음은 3이 하나라도 포함되어 있으므로 세어야 하는 시각입니다.
 * 
 * 시각을 일일히 비교하더라도 최대 24*60*60의 경우의 수만 존재한다. 
 */

public class Times {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int count = 0;
		
		for(int h=0;h<=N;h++) {
			for(int m=0;m<60;m++) {
				for(int s=0;s<60;s++) {
					if(h%10==3||m%10==3||m/10==3||s%10==3||s/10==3) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
