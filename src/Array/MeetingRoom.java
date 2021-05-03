package Array;

import java.util.Arrays;
import java.util.Comparator;
/*
 * Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all meetings.
 * 
 * Input: [[0,30],[5,10],[15,20]]
	Output: false
	Input: [[7,10],[2,4]]
	Output: true
 */

class Interval {
	int start;
	int end;

	Interval() {
		this.start = 0;
		this.end = 0;
	}

	Interval(int s, int e) {
		this.start = s;
		this.end = e;
	}

	@Override
	public String toString() {
		return start + ", "+end;
	}
	
}

public class MeetingRoom {
	public static void main(String[] args) {
		MeetingRoom a = new MeetingRoom();

		Interval in1 = new Interval(15, 20);
		Interval in2 = new Interval(5, 10);
		Interval in3 = new Interval(0, 30);

		Interval[] intervals = { in1, in2, in3 };
		System.out.println(a.solve(intervals));
	}

	public boolean solve(Interval[] intervals) {
		if (intervals == null)
			return false;
		// 1 sorting
		print(intervals);
		Arrays.sort(intervals, Comp);
		System.out.println("===after sort====");
		print(intervals);

		for (int i = 1; i < intervals.length; i++) {
			if (intervals[i - 1].end > intervals[i].start)
				return false;
		}

		return true;

	}

	public void print(Interval[] intervals) {
		for (int i = 0; i < intervals.length; i++) {
			Interval in = intervals[i];
			System.out.println(in.start + " " + in.end);

		}
	}
	Comparator<Interval> Comp = new Comparator<Interval>() {
//		비교객체
		@Override
		public int compare(Interval a, Interval b) {
			return a.start - b.start;
		}

	};
}
