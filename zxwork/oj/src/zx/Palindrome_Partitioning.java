package zx;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String string = "jsdfhshfale";
		System.out.println(partition(string));
	}

	public static List<List<String>> partition(String s) {
		List<List<String>> total = new ArrayList<List<String>>();

		if (s == null || s.length() == 0)
			return total;
		int start = 0;
		int i = 0;
		while (i < s.length()) {
			if (s.charAt(i) == s.charAt(start)
					&& ispartition(s.substring(start, i + 1))) {
				ArrayList<String> list = new ArrayList<String>();
				list.add(s.substring(start, i + 1));
				if (i == s.length() - 1) {
					total.add(list);
					break;
				} else
					getlist(i + 1, s, total, list);
			}
			i++;
		}
		return total;
	}

	public static void getlist(int start, String s, List<List<String>> total,
			ArrayList<String> list) {
		int i = start;
		while (i < s.length()) {
			if (s.charAt(i) == s.charAt(start)
					&& ispartition(s.substring(start, i + 1))) {
				ArrayList<String> newlist = (ArrayList<String>) list.clone();
				newlist.add(s.substring(start, i + 1));
				if (i == s.length() - 1) {
					total.add(newlist);
				} else
					getlist(i + 1, s, total, newlist);
			}
			i++;
		}
	}

	public static boolean ispartition(String s) {
		if (s.length() == 1)
			return true;
		if (s.length() == 0 || s == null)
			return false;
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
