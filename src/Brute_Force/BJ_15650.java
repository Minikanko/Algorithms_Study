package Brute_Force;

import java.util.Scanner;

public class BJ_15650 {
    static int N, M;
    static int[] selected;
    static StringBuffer sb = new StringBuffer();

    static void input() {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextInt();
        selected = new int[M];
    }

    static void recur(int k) {
        if (k == M) {
            for (int n : selected) sb.append(n).append(" ");
            sb.append("\n");
        } else {
            int start = 0;
            if(k>0){
                start = selected[k-1]+1;
            }

            if (start == 0) start = 1;
            for (int i = start; i <= N; i++) {
                selected[k] = i;
                recur(k + 1);
            }
        }
    }

    public static void main(String[] args) {
        input();
        recur(0);
        System.out.println(sb.toString());
    }
}
