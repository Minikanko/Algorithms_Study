package Greedy;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 1. 입력받기
 * 2. A 오름차순 정렬
 * 3. B에서 제일 큰수를 가져와서 곱하기
 */
public class BJ_1026 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int[] A = new int[N];
		int[] B = new int[N];
		
		for(int i =0;i<N;i++) {
			A[i] = scan.nextInt();
		}
		for(int i =0;i<N;i++) {
			B[i] = scan.nextInt();
		}
		
		Arrays.sort(A);
		boolean[]visit = new boolean[N];
		
		int sum =0;
		int maxIndex=0;
		for(int i =0;i<N;i++) {
			int max = 0;
			for(int j=0;j<N;j++) {
				if(!visit[j]&&max<=B[j]) {
					max = Math.max(max, B[j]);
					maxIndex=j;
				}
			}
			visit[maxIndex] = true;
			sum+=A[i]*max;
		}
		System.out.println(sum);
		
		
		
	}

}

