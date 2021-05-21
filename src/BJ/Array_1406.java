package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_1406 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int pointer = sb.length();

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
				if (pointer < sb.length()) {
					pointer++;
				}
				break;
			//커서 왼쪽에 있는 문자를 삭제함 (커서가 문장의 맨 앞이면 무시됨)
			case "B":
				if (pointer > 0) {
					sb.deleteCharAt(--pointer);
				}
				break;
			//$라는 문자를 커서 왼쪽에 추가함
			case "P":
				sb.insert(pointer, str[1]);
				pointer++;
				break;
			}
		}
		System.out.println(sb.toString());
	}
}
