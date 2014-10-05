package zx;

public class Reverse_Words_in_a_String {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "a  b";
		System.out.println(reverseWords(string));
	}

	public static String reverseWords(String s) {
		String[] strings = s.trim().split(" ");
		String string = "";
		for (int i = strings.length - 1; i >= 0; i--) {
			if (!strings[i].equals("")) {
				if (i == 0)
					string = string + strings[i];
				else
					string = string + strings[i] + " ";
			}
		}
		return string;

	}

}
