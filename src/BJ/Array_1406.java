package BJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;

public class Array_1406 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		List<String> list = new LinkedList<String>();
		String[] beforeStr = br.readLine().split("");
		for(String s: beforeStr)
			list.add(s);
		
		int M = Integer.parseInt(br.readLine());
		int pointer = list.size();

		while (M-- > 0) {
			String[] str = br.readLine().split(" ");
			switch (str[0]) {
			//커서를 왼쪽으로 한칸 옮김
			case "L":
				if (pointer > 0) {
					pointer--;
				}
				break;
			//커서를 오른쪽으로 한 칸 옮김
			case "D":
				if (pointer < list.size()) {
					pointer++;
				}
				break;
			//커서 왼쪽에 있는 문자를 삭제함 (커서가 문장의 맨 앞이면 무시됨)
			case "B":
				if (pointer > 0) {
					list.remove(--pointer);
				}
				break;
			//$라는 문자를 커서 왼쪽에 추가함
			case "P":
				list.add(pointer, str[1]);
				pointer++;
				break;
			}
		}
	list.forEach(x->{
		try {
			bw.write(x);
		} catch (IOException e) {
			e.printStackTrace();
		}
	});
		bw.flush();
		
	}
}
