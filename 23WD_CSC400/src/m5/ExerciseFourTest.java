package m5;

public class ExerciseFourTest {

	public static void main(String[] args) {
		/// Method One Test ///
		int n1 = 4;

		int factorialResult1 = ExerciseFour.factorialMethodOne(n1);

		System.out.println("Method one:");

		System.out.println("The factorial of " + n1 + " = " + factorialResult1 + "\n");

		/// Method Two Test ///
		int n2 = 0;

		int factorialResult2 = ExerciseFour.factorialMethodTwo(n2);

		System.out.println("Method two:");

		System.out.println("The factorial of " + n2 + " = " + factorialResult2);
	}

}
