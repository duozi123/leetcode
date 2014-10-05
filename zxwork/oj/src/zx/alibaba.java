package zx;

public class alibaba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String aString = "abdecab";
		String bString = "abdeabc";
		System.out.println(fun(aString, bString));

	}

	public static boolean fun(String a, String b) {
		if (a == null || b == null || a.length() != b.length())
			return false;
		if (a.equals(b))
			return true;
		int[][] ju = new int[a.length()][a.length()];
		int maxi = 0;
		int maxj = 0;

		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < a.length(); j++) {
				if (a.substring(i, i + 1).equals(b.substring(j, j + 1))) {
					if (i - 1 >= 0 && j - 1 >= 0) {
						ju[i][j] = ju[i - 1][j - 1] + 1;
						if (ju[i][j] > ju[maxi][maxj]) {
							maxi = i;
							maxj = j;
						}
					} else
						ju[i][j]++;
				}
			}
		}
		if (maxi != a.length() - 1 && maxj != a.length() - 1)
			return false;
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < a.length(); j++) {
				System.out.print(ju[i][j] + " ");
			}
			System.out.println();

		}
		System.out.println(maxi + " " + maxj);
		if (maxj > maxi) {
			System.out.println(a.substring(0, maxi + 1));
			if (b.substring(0, maxj - maxi).equals(
					a.substring(maxi + 1, a.length())))
				return true;
			else
				return false;
		} else {
			System.out.println(b.substring(0, maxj + 1));
			if (a.substring(0, maxi - maxj).equals(
					b.substring(maxj + 1, a.length())))
				return true;
			else
				return false;
		}

	}

}
