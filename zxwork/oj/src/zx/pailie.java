package zx;

import org.omg.CORBA.PUBLIC_MEMBER;

public class pailie {

	/**
	 * @param args
	 */
	static int num = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "12234";

		pai(s,"");
		System.out.println(num);
	}

	public static void pai(String string ,String s) {
		
		int[] index = new int[string.length()];
		for (int i = 0; i < index.length; i++) {
			index[i] = string.indexOf(String.valueOf(string.charAt(i)));

		}

		for (int i = 0; i < string.length(); i++) {
			if (i == index[i]) {
				
				if (string.length() == 1) {
					System.out.println(s+string);
					num++;
					return;
				}
				if (i == 0)
					pai(string.substring(i + 1),s+string.charAt(i));
				else
					pai(string.substring(0, i) + string.substring(i + 1),s+string.charAt(i));
			}
		}
	}

}
