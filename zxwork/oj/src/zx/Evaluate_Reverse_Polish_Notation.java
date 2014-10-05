package zx;

import java.util.Scanner;
import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {

	/**
	 * @param args
	 */
	public static int evalRPN(String[] tokens) {
		
		int first;
		int second;
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i].equals("+")) {
				if (s.size() >= 2) {
					second = (Integer) s.pop();
					first = (Integer) s.pop();
					s.push(second + first);
				}
			} else if (tokens[i].equals("-")) {
				if (s.size() >= 2) {
					second = (Integer) s.pop();
					first = (Integer) s.pop();
					s.push(first - second);
				}
			} else if (tokens[i].equals("*")) {
				if (s.size() >= 2) {
					second = (Integer) s.pop();
					first = (Integer) s.pop();
					s.push(first * second);
				}
			} else if (tokens[i].equals("/")) {
				if (s.size() >= 2) {
					second = (Integer) s.pop();
					first = (Integer) s.pop();
					s.push(first / second);
				}
			} else {
				s.push(Integer.parseInt(tokens[i]));
			}
		}

		if (!s.isEmpty())
			return (Integer) s.pop();
		else
			return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strings = {};
		System.out.println(evalRPN(strings));

	}
}
