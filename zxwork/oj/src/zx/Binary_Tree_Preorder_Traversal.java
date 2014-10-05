package zx;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Binary_Tree_Preorder_Traversal {
	public static void main(String[] args) {
		
		TreeNode1 root = new TreeNode1(1);
		TreeNode1 root2 = new TreeNode1(2);
		TreeNode1 root3 = new TreeNode1(3);
		root.left = root2;
		root2.right = root3;

		List<Integer> list = postorderTraversal(root);
		System.out.println(list);
	}

	public static List<Integer> postorderTraversal(TreeNode1 root) {

		List<Integer> list = new ArrayList<Integer>();
		if (root == null)
			return list;
		else {
			
			Stack<TreeNode1> stack = new Stack<TreeNode1>();

			TreeNode1 now = root;
			while (now != null || !stack.isEmpty()) {
				if (now != null) {
					list.add(now.val);
					stack.push(now);
					now = now.left;
				} else {
					now = stack.pop();
					now=now.right;
//					if (now != null) {
//						stack.push(now);
//						
//					}
					
					
				}
			}
		}
		return list;
	}

}

class TreeNode1 {
	int val;
	TreeNode1 left;
	TreeNode1 right;

	TreeNode1(int x) {
		val = x;
	}
}
