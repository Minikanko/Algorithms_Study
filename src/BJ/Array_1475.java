package BJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Array_1475 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		//0~9까지의 플라스틱 숫자를 담기 위한 배열 준비
		int[] numbers = new int[10];
		
		String[] str = br.readLine().split("");
		
		//입력된 숫자를 split 하고 숫자의 개수 만큼 numbers 배열의 인덱스값을 ++해준다
		//ex) 입력된 값: 9 -> numbers[9] = 1 이 되는것이다.
		// 6과 9는 한 숫자로 생각하고 numbers에 넣어준다.
		Arrays.stream(str).forEach(x->{
			int n = Integer.parseInt(x);
			if(n==9) n=6;
			numbers[n]++;
		});
		
		//6과 9를 6으로 생각하고 count를 했기 때문에 반으로 나눠준다. 0~9는 6과 9이렇게 2가지만 있기때문에 반으로 나눠주는것이다.
		numbers[6] = numbers[6]/2+numbers[6]%2;
		
		bw.append(Arrays.stream(numbers).max().getAsInt()+"\n");
		bw.flush();
	}

}
