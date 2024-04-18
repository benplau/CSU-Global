package m5;

public class ExerciseFour {
	/// Method One ///
	public static int factorialMethodOne(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorialMethodOne(n - 1);
	}

	/// Method Two ///
	public static int factorialMethodTwo(int n) {
		int result = 1, i;

		for (i = 2; i <= n; i++)
			result *= i;

		return result;
	}

}
