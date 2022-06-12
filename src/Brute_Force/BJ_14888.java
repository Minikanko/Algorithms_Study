package Brute_Force;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_14888 {
    static int N;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int[] nums;
    static int[] calArr;
    static int[] select = new int[4];

    static void input() {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        nums = new int[N];
        calArr = new int[4];

        for (int i = 0; i < N; i++) {
            nums[i] = scan.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            calArr[i] = scan.nextInt();
        }
    }

    static int calcul(int[] select) {
        int sum = nums[0];
        for (int i = 1; i < N; i++) {
            if (select[i - 1] == 0) {
                sum += nums[i];
            }
            if (select[i - 1] == 1) {
                sum -= nums[i];
            }
            if (select[i - 1] == 2) {
                sum *= nums[i];
            }
            if (select[i - 1] == 3) {
                sum /= nums[i];
            }
        }
        return sum;
    }

    static void recul(int k) {
        if (k == N - 1) {
            int result = calcul(select);
            min = Math.min(min, result);
            max = Math.max(max, result);
        } else {
            for (int i = 0; i < 4; i++) {
                if (calArr[i] >= 1) {
                    calArr[i]--;
                    select[k] = i;
                    recul(k + 1);
                    calArr[i]++;
                    select[k] = 0;

                }
            }
        }
    }


    public static void main(String[] args) {
        input();
        recul(0);
        System.out.println(min);
        System.out.println(max);

//		Scanner scan = new Scanner(System.in);
//
//		int N = scan.nextInt();
//		int[] nums = new int[N];
//		scan.nextLine();
//
//		String[] temp = scan.nextLine().split(" ");
//		for(int i=0;i<N;i++) {
//			nums[i] =Integer.parseInt(temp[i]);
//		}
//
//		int[] mathType = new int[4];
//		String[] tempMath = scan.nextLine().split(" ");
//
//		for(int i=0;i<N;i++) {
//			mathType[i] =Integer.parseInt(tempMath[i]);
//		}
//		//덧셈 , 뺄셈, 곱셈, 나눗셈
//
//		Arrays.sort(nums); //숫자 정렬
//
//		for(int i=N-1;i>=0;i--) {
//
//		}


    }

}
