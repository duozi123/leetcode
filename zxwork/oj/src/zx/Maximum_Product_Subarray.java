package zx;

import java.util.ArrayList;

public class Maximum_Product_Subarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = { -1, 0, -4,3  };
		System.out.println(maxProduct(a));
	}

	public static int maxProduct(int[] A) {
		if (A == null || A.length == 0)
			return 0;
		if (A.length == 1)
			return A[0];
		return product(A, 0, A.length - 1);

	}

	public static int product(int[] A, int low, int high) {
		if (low > high)
			return -65536;
		if (low == high)
			return A[low];

		int flag = 0;
		for (int i = low; i <= high; i++) {
			if (A[i] == 0) {
				flag = 1;

				return Math.max(0, Math.max(product(A, low, i - 1),
						product(A, i + 1, high)));

			}
		}
		ArrayList<Integer> index = new ArrayList<Integer>();
		for (int i = low; i <= high; i++) {
			if (A[i] < 0 && flag == 0) {
				index.add(i);

			}
		}
		if (index.size() % 2 == 0) {
			int product = 1;
			for (int i = low; i <= high; i++) {
				product = product * A[i];
			}
			return product;
		} else {

			return Math.max(Math.max(product(A, low, index.get(0) - 1),
					product(A, index.get(0) + 1, high)), Math.max(
					product(A, low, index.get(index.size() - 1) - 1),
					product(A, index.get(index.size() - 1) + 1, high)));

		}
	}

}
