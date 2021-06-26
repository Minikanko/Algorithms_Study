package Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;import com.sun.jdi.Value;

public class Sort_2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		List<Integer> nums = new ArrayList<Integer>();
		
		for(int i=0;i<N;i++) {
			nums.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(nums);
		for(int num:nums) {
			bw.write(num+"\n");
		}
		bw.flush();
	}

}
