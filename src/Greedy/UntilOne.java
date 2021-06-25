package Greedy;

import java.util.Scanner;

/*
 * 1이 될 때 까지
 * 
 * 문제)
 * 떠한 수 N이 1이 될 때까지 다음의 두 과정 중 하나를 반복적으로 선택하여 수행하려고 한다. 
 * 단, 두 번째 연산은 N이 K로 나누어떨어질 때만 선택할 수 있다.
 * N에서 1을 뺀다.
 * N을 K로 나눈다.
 * N과 K가 주어질 때 N이 1이 될 때까지 1번 혹은 2번의 과정을 수행해야 하는 최소 횟수를 구하는 프로그램을 작성하시오.
 * 
 * 최적의 해인 이유:
 * 어떤 방식이든 무조건 1로 도달할 수 있기 때문이다(-1을 할 수 있기 때문이다)
 * 
 */
public class UntilOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int K = scan.nextInt();
		int result = 0;

		while (true) {
			int n = N / K;
			result += N % K;
			N = n;
			result++; // 이렇게 나누는 행위도 +1이 되기때문에 연산해줌
			if (n < K)
				break;
		}
		result += N - 1;
		System.out.println(result);

	}
}
