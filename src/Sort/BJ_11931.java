package Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class BJ_11931 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> 	q = new PriorityQueue<>(Collections.reverseOrder());
		
		while(N-- > 0) {
			q.add(Integer.parseInt(br.readLine()));
		}
		while(!q.isEmpty())
			bw.append(q.poll()+"\n");
		bw.flush();
	}
	

}
