package zx;

public class Gas_Station {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] gas = { 6,0,1,3,2};
		int[] cost = { 4,5,2,5,5 };
		System.out.println(canCompleteCircuit(gas, cost));

	}

	public static int canCompleteCircuit(int[] gas, int[] cost) {
		if (gas.length != cost.length)
			return -1;
		int getgas = 0;
		int count = 0;
		int i = 0;

		int k = 0;
		for (i = gas.length - 1; i >= 0; i--) {
			// getgas = 0;
			// count = 0;

			getgas = getgas + gas[i] - cost[i];
			count++;
			if (gas[i] - cost[i] < 0||getgas<0) {

				continue;
			}
			// if(count==gas.length&&getgas>=0)
			// return i;
			//

			while (count <= gas.length) {

				getgas = getgas + gas[k] - cost[k];
				count++;
				if (getgas < 0)
					break;

				if (k == gas.length - 1)
					k = 0;
				else
					k++;

			}
			if (count > gas.length)
				return i;
		}

		return -1;

	}
}
