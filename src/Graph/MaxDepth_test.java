package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxDepth_test {
	public static void main(String[] args) {
		MaxDepth_test a = new MaxDepth_test();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.left.left.left = new TreeNode(6);
		System.out.println(a.solve(root));
	}

	private int solve(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		int count=0;
		q.add(root);
		while(!q.isEmpty()) {
			int size=q.size();
			for(int i=0;i<size;i++) {
				TreeNode t1 = q.poll();
				if(t1.left != null) {
					q.add(t1.left);
				}
				if(t1.right != null) {
					q.add(t1.right);
				}
			}
			count++;
		}
		return count;
	}
	
	
}
