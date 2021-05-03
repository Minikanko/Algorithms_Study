package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Basic_10804 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] arr = new int[20];
		for(int i=0;i<20;i++) {
			arr[i]=i+1;
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=0;
		while(N++ < 10) {
			String[] str = br.readLine().split(" ");
			int begin = Integer.parseInt(str[0])-1;
			int end = Integer.parseInt(str[1]);
			int index = 1;
			for(int i=begin;i<(begin+end)/2;i++,index++) {
				int temp = arr[end-index];
				arr[end-index] = arr[i];
				arr[i] = temp;
			}
		}
		
		Arrays.stream(arr).forEach(x->System.out.print(x+" "));
		
	}
}
