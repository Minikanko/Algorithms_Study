package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

/*
    x기준으로 배열을 한번씩 다돌면서 x-배열값을 뺀 숫자가 있는지 찾기! 찾아서 첫번째
 */
public class BJ_3273 {
    static int N, X;
    static int[] A;

    static void input() {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) A[i] = scan.nextInt();

        X = scan.nextInt();
    }

    static void findResult() {
        int count = 0;
        Arrays.sort(A);


        for (int i = 0; i < N; i++) {
            if (X <= A[i]) {
                continue;
            }
            if (search(A, 0, N - 1, X - A[i])) {
                count++;
            }
        }
        System.out.println(count/2);
    }

    static boolean search(int[] a, int L, int R, int target) {
        while (L <= R) {
            int mid = (L + R) / 2;

            if (a[mid] < target) {
                L = mid + 1;
            } else if (a[mid] > target) {
                R = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        input();
        findResult();
    }
}
