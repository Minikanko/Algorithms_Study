package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class LinkedList_1158 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		
		int N = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1]);
		int index = 0;		//리스트의 위치를 알려줄 변수
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=1;i<=N;i++) {
			list.add(i);
		}
		bw.append("<");
		K--;				//list 인덱스와 맞추기 위해서 -1
		
		while(!list.isEmpty()) {
			index+=K;
			//현재 위치를 가리키는 index가 배열의 사이즈 범위를 넘어갈 수 있는 상황을 배제하기 위해 % 연산자 사용한다.
			if(index >= list.size()) index%=list.size();		 
			
			if(list.size()!=1) {
				bw.write(list.get(index)+", ");
			}
			else {
				bw.write(list.get(index)+">");
			}
			
			list.remove(index);
		}
		bw.flush();
		
	}
}
