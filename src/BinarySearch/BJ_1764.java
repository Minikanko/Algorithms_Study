package BinarySearch;

/*
    듣도 보고 못한 사람(교집합)
    N: 듣도 못한
    M: 보도 못한
    교집합을 찾고 사전순으로 출력하라


 */


import java.util.Arrays;
import java.util.Scanner;

public class BJ_1764 {
    static int N, M,count;
    static String[] A, B;
    static StringBuilder sb = new StringBuilder();

    static void input() {
        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        M = scan.nextInt();

        A = new String[N];
        B = new String[M];


        for (int i = 0; i < N; i++) A[i] = scan.next();
        for (int i = 0; i < M; i++) B[i] = scan.next();

    }


    static void binarySearch() {
        Arrays.sort(B);
        Arrays.sort(A);

        for (int i = 0; i < N; i++) {
            if (search(B, 0, M - 1, A[i])) {
                sb.append(A[i]+"\n");
            }
        }
    }

    static boolean search(String[] str, int L, int R, String target) {

        while (L <= R) {
            int mid = (L + R) / 2;
            if(str[mid].equals(target)){
                count++;
                return true;
            }

            if (str[mid].compareTo(target) <0) {
                L = mid + 1;
            } else {
                R = mid - 1;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        input();
        binarySearch();
        System.out.println(count);
        System.out.println(sb.toString());
    }
}
