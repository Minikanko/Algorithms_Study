package Greedy;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 접근방법)
 * 해당 문제는 시간 누적관련 문제로 3번째에 있는 사람은 1번재, 2번째 사람의 인출시간만큼 추가적으로 더 시간이 소요된다는 점을 이용해야 한다.
 * 재귀방법으로도 접근 가능
 */
public class BJ_11399 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int[] times = new int[N];

		for (int i = 0; i < N; i++) {
			times[i] = scan.nextInt();
		}
		Arrays.sort(times);
		
		int sum = 0;
		for(int i=0;i<N;i++) {
			sum += (times[i]*(N-i));
		}
		System.out.println(sum);
		
		
		//System.out.println(recul(times, 0, 0));

	}

//	public static int recul(int[] times, int index,int sum) {
//		if(index==times.length) return sum;
//		else {
//			return times[index]+recul(times,index++,sum+times[index]);
//		}
//	}
}
