package LinkedList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MergeKSortedList {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(5);

		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);

		ListNode l3 = new ListNode(2);
		l3.next = new ListNode(6);

		ListNode[] list = new ListNode[3];
		list[0] = l1;
		list[1] = l2;
		list[2] = l3;
		MergeKSortedList a = new MergeKSortedList();
		ListNode result = a.mergeKLists(list);
		System.out.println("====");
		while(result !=null) {
			System.out.println(result.val);
			result= result.next;
		}
	}

	//1. 링크드를 모두 넣는다.
	//2. 그리고 정렬을한다.
	private ListNode mergeKLists(ListNode[] list) {
		Queue<ListNode> q = new PriorityQueue<ListNode>(comp);
		ListNode result = new ListNode(0);
		ListNode p=result;
		//복사하는 이유는 복사하지 않았을때 result의 최종위치는 링크노드의 마지막 위치로 이동하기 때문이다.
		for(ListNode l:list) {
			if(l !=null) {
				q.add(l);
			}
		}
		while(!q.isEmpty()) {
			ListNode temp = q.poll();
			p.next=temp;
			p = p.next;
			if(temp.next!=null) {
				q.add(temp.next);
			}
		}
		return result.next;
	}
	
	public static Comparator<ListNode> comp = new Comparator<ListNode>() {

		@Override
		public int compare(ListNode o1, ListNode o2) {
			return o1.val-o2.val;
		}
	};
		
		
		/*
		ListNode result = list[0];
		int temp =0;
		for(int i=1;i<list.length;i++) {
			//list[i]가 끝났는지 확인
			while(list[i] != null || result !=null) {
				if(result.val >= list[i].val) {
					temp = result.val;
					result = list[i];
					result.next= new ListNode(temp);
				}
				else {
					result.next = list[i];
					result = result.next;
				}
				result = result.next;
				list[i]=list[i].next;
			}
		}*/
	}
