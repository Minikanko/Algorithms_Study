package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Basic_2309 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=0;
		int[] arr = new int[9];
		while(N < 9) {
			arr[N++]=Integer.parseInt(br.readLine());
		}
		
		
		Arrays.sort(arr);
		Arrays.stream(arr).forEach(x->System.out.println(x));
		
	}

}
