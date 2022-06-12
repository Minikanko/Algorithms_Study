package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

/*
   A의 정수들이 M의 정수가 있는지 말하는것
   A를 비순서로 놓고
   B를 순서로 정렬
   예상시간은
   10만 * 10만 100 0000 0000 => 100초
   logN
 */
public class BJ_1920 {
    static int[] A, B;
    static int N, M;
    static StringBuilder sb = new StringBuilder();

    static void input() {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) A[i] = scan.nextInt();

        M = scan.nextInt();
        B = new int[M];
        for (int i = 0; i < M; i++) B[i] = scan.nextInt();
    }

    static void binarySearch() {
        Arrays.sort(A);

        for (int i = 0; i < M; i++) {

           boolean result =  search(A, 0, N - 1, B[i]);
           sb.append(result?"1":"0").append("\n");

        }
    }

    static boolean search(int[] b, int L, int R, int target) {
        boolean isNum = false;

        while (L <= R) {
            int mid = (L + R) / 2;

            if (b[mid] < target) {
                L = mid + 1;
            } else if (b[mid] > target) {
                R = mid - 1;
            } else {
                isNum = true;
                return isNum;

            }
        }
            return isNum;
    }

    public static void main(String[] args) {
        input();
        binarySearch();
        System.out.println(sb.toString());

    }
}
