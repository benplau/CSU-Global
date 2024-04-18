package m5;

public class ExerciseFive {

	public static void displayArrayBackward(int[] arr, int start, int end) {
		if (end < start) {
			return;
		} else {
			System.out.print(arr[end] + " ");

			displayArrayBackward(arr, start, end - 1);
		}
	}

}
