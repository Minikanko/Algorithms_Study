package LinkedList;

class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		this.val = x;
	}
}

public class AddTwoNumbers {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(2);
		ListNode node = solve(l1, l2);
		while(node!=null) {
			System.out.println(node.val);
			node = node.next;
		}
	}
//내가 모르는 부분: 어떻게 l1의 크기 만큼 next를 생성할것인가
	private static ListNode solve(ListNode l1, ListNode l2) {
		ListNode result = null;
		//얇은 복사
		ListNode p1=l1;
		ListNode p2=l2;
		int value=0;
		
		while(p1 != null||p2 !=null) {
			if(p1!=null) {
				value+=p1.val;
				p1=p1.next;
			}
			if(p2!=null) {
				value+=p2.val;
				p2=p2.next;
			}
			result = new ListNode(value%10);
			result = result.next;
			value/=10;
		}
		if(value==1) {
			result = new ListNode(1);
		}
		return result;
	}
}
