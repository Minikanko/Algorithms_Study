package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Array_13300 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1]);
		int count = 0;							// 방의 최소 개수
		int[][] classs = new int[2][6];			// [성별][학년]
		
		//학생수 N만큼만 입력받기
		while(N-- > 0) {
			String[] temp = br.readLine().split(" ");
			int sex = Integer.parseInt(temp[0]);
			int grade = Integer.parseInt(temp[1]);
			//grade는 1부터 입력되니깐 인덱스와 맞춰주기 위해 -1
			classs[sex][grade-1]++;
		}
		
		for(int i =0;i<classs.length;i++) {
			for(int j=0;j<classs[i].length;j++) {
				count+=classs[i][j]/K;
				//방이 딱 떨어지지 않는 경우 방이 1개 더 필요함 
				if(classs[i][j]%K==0) {
					count++;
				}
			}
		}
		bw.append(count+"\n");
		bw.flush();
	}

}
