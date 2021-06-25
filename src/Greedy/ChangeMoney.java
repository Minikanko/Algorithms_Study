package Greedy;

import java.util.Scanner;

/*
 * 거스름 돈
 * 문제)
 * 당신은 음식점의 계산을 도와주는 점원입니다. 
 * 카운터에는 거스름돈으로 사용할 500원, 100원, 50원,10원 짜리 동전이 무한히 존재한다고 가정합니다.
 * 손님에게 거슬러 주어야 할 돈이 N원일 대 거슬러 주어야 할 동전의 최소 개수를 구하세요.
 * 단, 거슬러 줘야 할 돈 N은 항상 10의 배수입니다.
 * 
 * 최적의 해인 이유 : 
 * 가지고 있는 동전 중에서 큰 단위가 항상 작은 단위의 배수이므로 작은 단위의 동전들을 종합해 다른 해가 나올수 없기때문이다.
 * 만약 큰단위가 작은 단위의 배수가 아닌경우에는 이와 같은 방법으로 최적의 해는 구할수없다.
 */
public class ChangeMoney {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int count = 0;
		int[] moneyKind = {500,100,50,10};
		
		for(int i =0;i<moneyKind.length;i++) {
			count += N/moneyKind[i];
			N%=moneyKind[i];
		}
		System.out.println(count);
	}

}
