package Queue_Stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class LevelOrder2 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		System.out.println(solve(root));
	}

	private static List<List<Integer>> solve(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()) {
			List<Integer> l = new ArrayList<Integer>();
			int size = q.size();
			for(int i=0;i<size;i++) {
				TreeNode t = q.poll();
				l.add(t.val);
				if(t.left !=null) {
					q.add(t.left);
				}
				if(t.right !=null) {
					q.add(t.right);
				}
			}
			list.add(l);
		}
		return list;
	}
}
