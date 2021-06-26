package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Basic_2480 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int[] intTemp = new int[3];
		int don=0;
		
		for(int i=0;i<3;i++) {
			intTemp[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(intTemp);
		
		if(intTemp[0]!=intTemp[1]&&intTemp[1]!=intTemp[2]){
			don=intTemp[2]*100;
		}
		else if(intTemp[0]==intTemp[1]&&intTemp[1]==intTemp[2]) {
			don = 10000+intTemp[0]*1000;
		}
		else {
			if(intTemp[0]==intTemp[1]){
				don = 1000+intTemp[0]*100;
			}
			else if(intTemp[1]==intTemp[2]){
				don = 1000+intTemp[1]*100;
			}
			
		}
		
		System.out.println(don);
	}
}
