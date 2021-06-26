package DFS_BFS;

public class MaxDepth_reculsive_test {
	public static void main(String[] args) {
		MaxDepth_reculsive_test a = new MaxDepth_reculsive_test();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		System.out.println(a.maxDepth(root));
	}

	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		System.out.println("root숫자: "+root.val);
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);

		return Math.max(left, right) + 1;
	}
}
