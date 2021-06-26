package Array;

import java.util.List;

public class ReverseLinkedList {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(4);
		l1.next.next.next.next = new ListNode(5);

		printNode(l1);
		ListNode head = reverseList(l1);
		printNode(head);
	}

	// 리스트노드 역정렬
	// 1. 현재 출력된것을 어느 노드의 이전노드로 만들어준다.
	private static ListNode reverseList(ListNode l1) {
		ListNode next = null;
		ListNode prev = null;
		while(l1 !=null) {
			next=l1.next;
			l1.next = prev;
			prev=l1;
			l1=next;
		}
		
		return prev;
	}
	

	/*
	 * ListNode p = new ListNode(0); ListNode result = p; ListNode temp =null;
	 * while(l1!=null) { temp = result; result.next=temp; result=l1; l1=l1.next;
	 */

	// 리스트노드 출력
	private static void printNode(ListNode l1) {
		while (l1 != null) {
			System.out.print(l1.val+" ");
			l1 = l1.next;
		}
		System.out.println("");
	}

}
