package Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/*
Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), find the minimum number of conference rooms required.
Input: [[0,30],[5,10],[15,20]]
Output: 2
Input: [[7,10],[2,4]]
Output: 1

개념)
그럼 우선순위 큐(Priority Queue)란 무엇일까? 
우선순위 큐는 Queue 인터페이스 구현체 중의 하나로, 저장한 순서에 구애받지 않고 우선순위에 따라 정렬되며, 
가장 우선순위가 높은 것부터 꺼낼 수 있다. 큐가 First-In, First-Out구조라면, 우선순위 큐는 Least-First-Out 혹은 Large-First-Out 구조로 작동하는 것이다.
Heap
힙은 모든 노드가 특정한 순서로 정렬된 이진 트리 구조의 자료구조로, 
가장 큰 값이나 가장 작은 값을 빠르게 찾을 수 있는 특징을 가지고 있어서 우선순위 큐를 구현하는 데 적합한 자료구조라고 할 수 있다.
*/
public class MeetingRoom2 {
	public static void main(String[] args) {
		MeetingRoom2 a = new MeetingRoom2();
		Interval in1 = new Interval(5,10);
		Interval in2 = new Interval(15,20);
		Interval in3 = new Interval(0,30);
		Interval in4 = new Interval(7,10);
		Interval in5 = new Interval(2,4);
		Interval[] intervals = {in1,in2,in3,in4,in5};
		System.out.println(a.solve(intervals));
	}

	private int solve(Interval[] intervals) {
		Stack<Interval> stack = new Stack<Interval>();
		//1. 정렬
		Arrays.sort(intervals,comp);
		print(intervals);
		//2. end와 start를 비교한다.
		for(Interval i : intervals) {
			//회의실이 필요하지 않은 상황
			if(!stack.isEmpty()&&stack.peek().end<i.start) {
				stack.peek().end=i.end;
			}
			else {
				stack.push(i);
			}
		}
		return stack.size();
	}
	
	//정렬
	Comparator<Interval> comp = new Comparator<Interval>() {
		@Override
		public int compare(Interval o1, Interval o2) {
			return o1.start-o2.start;
		}
		
	};
	
	private void print(Interval[] intervals) {
		for(Interval i :intervals) {
			System.out.println(i);
		}
	}

}	

		

/*
두번째방법:priorityqueue 사용
	private int solve(Interval[] intervals) {
		Arrays.sort(intervals,Comp);
		//우선순위 queue
		Queue<Interval> q = new PriorityQueue<>(intervals.length,reverseComp);
		
		for(int i=0;i<intervals.length;i++) {
			//강의실을 공유해서 사용가능한 경우, 그전에 수업시간을 queue에서 제거
			if(!q.isEmpty()&&q.peek().end<intervals[i].start) {
				q.poll();
			}
			q.offer(intervals[i]);
		}
		return q.size();
	}
	//출력
	private void print(Interval[] intervals) {
		for(Interval i:intervals) {
			System.out.println(i);
		}
	}
	Comparator<Interval> Comp = new Comparator<Interval>() {
		@Override
		public int compare(Interval o1, Interval o2) {
			return o1.start-o2.start;
		}
	};

	Comparator<Interval> reverseComp = new Comparator<Interval>() {
		@Override
		public int compare(Interval o1, Interval o2) {
			return o1.end-o2.end;
		}
	};
*/

	



