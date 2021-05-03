package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
We have a list of points on the plane. Find the K closest points to the origin (0, 0).
(Here, the distance between two points on a plane is the Euclidean distance.)
You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in.)
Example 1:
Input: points = [[1,3],[-2,2]], K = 1
Output: [[-2,2]]
Explanation:
The distance between (1, 3) and the origin is sqrt(10).
The distance between (-2, 2) and the origin is sqrt(8).
Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
We only want the closest K = 1 points from the origin, so the answer is just [[-2,2]].
*/
public class KClosestPointstoOrigin {

	public static void main(String[] args) {
		long a=System.currentTimeMillis();
		List<Interval> list = new ArrayList<Interval>();
		Interval in1 = new Interval(1, 3);
		Interval in2 = new Interval(-2, 2);
		Interval in3 = new Interval(-1, 2);
		list.add(in1);
		list.add(in2);
		list.add(in3);
		kClosest(list, 2);
		long b=System.currentTimeMillis();
		System.out.println("소요시간: "+(b-a));
	}

	private static void kClosest(List<Interval> list, int i) {
		Collections.sort(list,comp);
		for(int a=0;a<i;a++) {
			System.out.println(list.get(a));
		}
	}
	
	private static Comparator<Interval> comp=new Comparator<Interval>() {
		@Override
		public int compare(Interval o1, Interval o2) {
			int f=(int) (Math.pow(0-o1.start,2)+Math.pow(0-o1.end, 2));
			int s=(int) (Math.pow(0-o2.start,2)+Math.pow(0-o2.end, 2));
			return f-s;
		}
	};

}
