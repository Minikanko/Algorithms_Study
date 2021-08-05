package Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BJ_11650 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int N = Integer.parseInt(br.readLine());
        List<loca> list = new ArrayList<loca>();
        while(N-->0) {
        	String[] temp = br.readLine().split(" ");
        	loca l = new loca(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
        	list.add(l);        
    	}
        Collections.sort(list, new Comparator<loca>() {

			@Override
			public int compare(loca o1, loca o2) {
				if(o1.x==o2.x)
					return o1.y-o2.y;
				return o1.x-o2.x;
			}
		});
        for(loca l : list) {
        	bw.append(l.getX()+" "+l.getY()+"\n");
        }
        bw.flush();
	}
	
	public static class loca{
		int x;
		int y;
		public loca(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		
	}

}
