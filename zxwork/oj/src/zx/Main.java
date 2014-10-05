package zx;

import java.util.ArrayList;
import java.util.Scanner;

class TreeNode {
	public TreeNode left;
	public TreeNode right;
	public Integer value;

	TreeNode(Integer value) {
		this.value = value;
		// System.out.println(value);
	}
}

public class Main {
	static ArrayList<Integer> list = new ArrayList<Integer>();

	Main(ArrayList integers) {
		createSortTree(integers);
	}

	private TreeNode root;

	private void createSortTree(ArrayList integers) {
		for (int i = 0; i < integers.size(); i++) {
			if (root == null) {

				root = new TreeNode((Integer) integers.get(i));
			} else if (root.value > (Integer) integers.get(i)) {
				insertLeft(root, (Integer) integers.get(i));
			} else {
				insertRight(root, (Integer) integers.get(i));
			}
		}
	}

	private void insertLeft(TreeNode root2, Integer nodeValue) {
		if (root2.left == null) {
			root2.left = new TreeNode(nodeValue);
		} else if (root2.left.value > nodeValue) {
			insertLeft(root2.left, nodeValue);
		} else {
			insertRight(root2.left, nodeValue);
		}

	}

	private void insertRight(TreeNode root2, Integer nodeValue) {
		if (root2.right == null) {

			root2.right = new TreeNode(nodeValue);
		} else if (root2.right.value > nodeValue) {
			insertLeft(root2.right, nodeValue);
		} else {
			insertRight(root2.right, nodeValue);
		}
	}

	private void middleTraversing(TreeNode root) {
		if (root.left != null)
			/** 第一步访问左子树 */
			middleTraversing(root.left);
		list.add(root.value);
		// System.out.println(root.value); /** 第二步访问根结点 */
		if (root.right != null)
			middleTraversing(root.right);
		/** 第三步访问右子树 */
	}

	public TreeNode getRoot() {
		return root;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> integers = new ArrayList<Integer>();
		while (scanner.hasNext())
			integers.add(Integer.parseInt(scanner.nextLine()));

		Main tree = new Main(integers);

		tree.middleTraversing(tree.getRoot());
		System.out.println(list.get(list.size() - 1) - list.get(0));
	}
}