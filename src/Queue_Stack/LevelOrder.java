package Queue_Stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

class TreeNode{
	int val;
	TreeNode left, right;
	TreeNode(int x){
		this.val=x;
	}
}

public class LevelOrder {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		System.out.println(solve(root));
	}

	private static List<List<Integer>> solve(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(root==null) {
			return list;
		}
		
		//1. 트리노드를 queue 넣어줌
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		
		
		//2. 레벨별로 출력하기
		while(!q.isEmpty()) {
			List<Integer> l = new ArrayList<Integer>();
			//데이터값이 변경 될수있기때문에 다른 변수에 담아준다.
			int size=q.size();
			for(int i=0;i<size; i++) {
				TreeNode t = q.poll();
				l.add(t.val);
				if(t.left!=null) {
					q.offer(t.left);
				}
				if(t.right!=null) {
					q.offer(t.right);
				}
			}
			list.add(l);
		}
		return list;
	}
}
