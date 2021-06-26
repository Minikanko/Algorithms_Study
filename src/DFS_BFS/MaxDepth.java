package DFS_BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
	int val;
	TreeNode left, right;

	TreeNode(int x) {
		this.val = x;
	}
}
public class MaxDepth {
	public static void main(String[] args) {
		MaxDepth a = new MaxDepth();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.left.left.left = new TreeNode(6);
		System.out.println(a.solve(root));
	}
	
	//1.내 자식이 있는지 확인
	//2. 자식이 있다면 계속해서 다라가는데 거기에서 구하는 count를 구한다.
	int solve(TreeNode root) {
		int depths=0;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()) {
			int size=q.size();
			for(int i=0;i<size;i++) {
				TreeNode temp = q.poll();
				
				if(temp.left != null) {
					q.add(temp.left);
				}
				if(temp.right != null) {
					q.add(temp.right);
				}
			}
			depths++;
		}
		return depths;
	}
}
