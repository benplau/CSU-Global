package m5;

import java.util.Random;

public class ExerciseFiveTest {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		Random random = new Random();

		int start = random.nextInt(array.length);

		int end = random.nextInt(array.length - start - 1) + 1 + start;

		System.out.println("Array elements (backward):");

		ExerciseFive.displayArrayBackward(array, start, end);
	}

}
