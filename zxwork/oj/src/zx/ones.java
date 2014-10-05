package zx;

public class ones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int res =1;
		int n = 2;
		while (res != n) {
			res = res + getone(n+1);
			n++;
		}
		System.out.println(n);
	}

	public static int getone(int n) {
		
		int num = 0;
		String string = String.valueOf(n);
		char[] c = string.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '1')
				num++;

		}
		System.out.println(num);
		return num;
	}

}
