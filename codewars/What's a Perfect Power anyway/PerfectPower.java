public class PerfectPower {
	public static int[] isPerfectPower(int n) {
		for (int k = 2; k <= n / 2; k++) {
			double a = Math.pow(n, 1.0 / k);
			if (a < 2)
				return null;
			if (Math.abs(Math.round(a) - a) < 0.00000000001)
				return new int[] { (int) a, k };
		}
		return null;
	}
}