package zx;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Generate_Parentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = generateParenthesis(5);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

	public static List<String> generateParenthesis(int n) {

		ArrayList<String> list = new ArrayList<String>();

		int k = 0;
		String string = new String();
		function(list, k, n, string);
		return list;

	}

	public static void function(ArrayList<String> list, int k, int n,
			String s) {

		if (n == 0) {
			while (k != 0) {
				k--;
				s=s+")";
			}
			list.add(s);
			return;

		}
		int x=k;
		int y=k;
		x++;
		function(list, x, n - 1, s+"(");
		if (y >0) {
			y--;
			function(list, y, n, s+")");
		}
	}
}
