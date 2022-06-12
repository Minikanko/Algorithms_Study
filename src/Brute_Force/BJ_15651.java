package Brute_Force;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
    중복되는 1~N까지에서 M개의 수열을 찾아라

 */
public class BJ_15651 {
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int[] selected;

    static void input() {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextInt();
        selected = new int[M + 1];
    }

    public static void main(String[] args) {
        input();
        rec_func(1);
        System.out.println(sb.toString());

    }


    public static void rec_func(int k) {
        if (k == M + 1) {
            for (int i=1;i<=M;i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
        } else {
            for (int i = 1; i <= N; i++) {
                selected[k] = i;
                rec_func(k + 1);
                selected[k]=0;
            }

        }

    }
}
