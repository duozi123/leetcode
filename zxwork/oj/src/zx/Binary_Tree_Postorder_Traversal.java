package zx;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Postorder_Traversal {

	public static void main(String[] args) {
		Binary_Tree_Postorder_Traversal p = new Binary_Tree_Postorder_Traversal();
		TreeNode root = p.new TreeNode(1);
		TreeNode root2 = p.new TreeNode(2);
		TreeNode root3 = p.new TreeNode(3);
		root.right = root2;
		root2.left = root3;

		List<Integer> list = postorderTraversal(root);
		System.out.println(list);
	}

	public static List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		if (root == null)
			return list;
		else {

			visittree(root, list);
			return list;
		}
	}

	public static void visittree(TreeNode root, List<Integer> list) {
		if (root.left == null && root.right == null) {
			list.add(root.val);
			return;
		}
		if (root.left != null) {
			visittree(root.left, list);
		}
		if (root.right != null) {
			visittree(root.right, list);
		}
		list.add(root.val);
	}

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
