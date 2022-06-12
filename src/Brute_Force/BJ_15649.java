package Brute_Force;

import java.util.Scanner;

/*
    중복이 없다.

 */
public class BJ_15649 {
    static int N, M;
    static int[] selected;
    static StringBuilder sb = new StringBuilder();

    static void input() {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextInt();
        selected = new int[M];
    }

    static void recur(int k) {
        //맞을때?
        if (k == M) {
            for (int n : selected) {
                sb.append(n).append(" ");
            }
            sb.append("\n");
        }

        //안맞을떄?
        else {
            for (int i = 1; i <= N; i++) {
                boolean is_not_used = true;

                for (int n : selected) {
                    if (n == i) {
                        is_not_used = false;
                    }
                }
                if (!is_not_used) continue;
                selected[k] = i;
                recur(k + 1);
                selected[k] = 0;
            }
        }
    }

    public static void main(String[] args) {
        input();
        recur(0);
        System.out.println(sb.toString());
    }
}
