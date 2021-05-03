package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/*
Given a collection of intervals, merge all overlapping intervals.
ex)
Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
*/

public class MergeInterval {
	public static void main(String[] args) {
		Interval in1 = new Interval(1, 3);
		Interval in2 = new Interval(2, 6);
		Interval in3 = new Interval(7, 8);
		Interval in4 = new Interval(7, 10);
		Interval[] intervals = { in1, in2, in3,in4 };
		MergeInterval a = new MergeInterval();
		List<Interval> list = a.merge(intervals);
		a.print(list);
	}

	private void print(List<Interval> list) {
		for(Interval i :list) {
			System.out.println(i);
		}
	}
 	private List<Interval> merge(Interval[] intervals) {
		List<Interval> list = new ArrayList<Interval>();
		//정렬
		Arrays.sort(intervals,Comp);
		//merge
		Stack<Interval> stack = new Stack<Interval>();
		for(int i=0;i<intervals.length;i++) {
			//peek에 있는값과 그다음값을 비교
			if(!stack.empty()&&stack.peek().end>=intervals[i].start) {
				//i+1의 start가 i의 end보다 작다하더라도 i+1의 end값이 i의 end보다 클수있고 작을수도 있기때문에 max메소드 사용
				stack.peek().end=Math.max(stack.peek().end, intervals[i].end);
			}
			else {
				stack.push(intervals[i]);
			}
		}
		for(Interval i:stack) {
			list.add(i);
		}
		return list;
	}
	
	Comparator<Interval> Comp = new Comparator<Interval>() {
		@Override
		public int compare(Interval o1, Interval o2) {
			return o1.start-o2.start;
		}
	};

}
