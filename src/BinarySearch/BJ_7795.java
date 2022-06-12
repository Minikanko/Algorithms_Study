package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

/*
    T: 테스트 케이스 개수
    A: N
    B: M
    N의 배열
    M의 배열

     8 1 7 3 1
     3 6 1
     A: 1 3 7 8
     B: 1 3 6
     1 3 3
     1. A를 정렬하고 B를 정렬한다.
     2. A를 for 문 돌면서, B값을 찾는다 그리고 그 이전값을 반환한다.

 */
public class BJ_7795 {
    static int N, M;
    static int[] A, B;
    static StringBuilder sb = new StringBuilder();
    static  Scanner scan = new Scanner(System.in);

    static void input() {


        N = scan.nextInt();
        M = scan.nextInt();
        A = new int[N];
        B = new int[M];

        for (int i = 0; i < N; i++) A[i] = scan.nextInt();
        for (int i = 0; i < M; i++) B[i] = scan.nextInt();
    }

    static void binarySearch() {
        Arrays.sort(B);
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += search(B, 0, M - 1, A[i]);
        }
        sb.append(sum).append("\n");
    }

    static int search(int[] B, int L, int R, int target) {
        int result = L ;

        while (L <= R) {
            int mid = (L + R) / 2;
            if (B [mid] < target) {
                result = mid+1;
                L = mid + 1;
            } else if (B[mid] >= target) {
                R = mid - 1;
            }
        }
        return  result;
    }

    public static void main(String[] args) {

        int T = scan.nextInt();

        for(int i=0;i<T;i++){
            input();
            binarySearch();
        }
        System.out.println(sb.toString());


    }
}
