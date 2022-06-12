package Brute_Force;

import java.io.BufferedReader;
import java.util.Scanner;

public class BJ_15652 {

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
        //다채웠을때?
        if (k == M) {
            for (int n : selected) sb.append(n).append(" ");
            sb.append("\n");
        }

        //다 못채웠을떄
        else {
            for (int cand = 1; cand <= N; cand++){
                if(k==0){
                    selected[k]=cand;
                    recur(k+1);
                }
                if(k>0 && selected[k-1]<=cand){
                    selected[k]=cand;
                    recur(k+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        input();
        recur(0);
        System.out.println(sb.toString());

    }
}
