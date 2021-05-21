package BJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * @author  	: Mr.K
 * @Date 		: 2021. 5. 20.
 * @Info : 
 *  보통 풀이법을 보면 str1 과 str2를 정렬하여 둘이 더해서 x 값과 같을때에만 count++하는 풀이법이 많았다.
 *  다른 방법도 있다는 것을 보여주고 싶어서 set의 특성을 활용하였다.
 *  참고로 두가지 방법으로 모두 풀었을때 속도차이는  전자가 더 빠르다.
 */
public class Array_3273 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(br.readLine());
		int count =0;
		
		//Set을 활용
		Set<Integer> set = new HashSet<Integer>();
		
		//Set에 해당 숫자를 넣는다.
		while(st.hasMoreTokens()) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		for(Integer str : set) {
			if(set.contains(x-str)) count++;
		}
		//쌍이기 때문에 나누기 2를 해줘야한다.
		System.out.println(count/2);
	}

}
