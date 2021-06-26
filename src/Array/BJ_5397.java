package Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;

public class BJ_5397 {

	
	/*
	 * 길이가 L인 문자열
	 * 백스페이스 : - (글자지움)
	 * 화살표 : < , > (커서 움직임)
	 * 커서 위치가 줄의 마지막이 아니면 커서 및 커서 오른쪽에 있는 모든 문자는 오른쪽으로 한칸이동
	 * 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
			String str = br.readLine();
			List<Character> list = new LinkedList<Character>();
			int index=-1;
			
			for(char c : str.toCharArray()) {
				switch (c) {
				case '-':
					if(list.size()>0) {
						list.remove(index);
						index--;
					}
					break;
					
				case '>':
					if(index<list.size()-1) index++;
					else index=list.size()-1;
					break;
					
				case '<':
					if(index>-1) index--;
					break;

				default:
					list.add(c);
					index++;
					break;
				}
			}
			for(char c : list)
				System.out.print(c);
		}
		
	}

}
