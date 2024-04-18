package m3;

public class CriticalThinkingThree {

	public static int findMissingInteger(int[] array) {
		int n = array.length;

		int missingInteger = -1;

		for (int i = 1; i <= n + 1; i++) {
			boolean found = false;

			for (int j = 0; j < n; j++) {
				if (array[j] == i) {
					found = true;
					break;
				}
			}

			if (!found) {
				missingInteger = i;
			}
		}

		return missingInteger;
	}

	// Testing with the example from the exercise question
	public static void main(String[] args) {
		int[] array = { 3, 6, 5, 1, 4 };

		int missingInteger = findMissingInteger(array);

		System.out.println("The missing integer is: " + missingInteger);
	}

}


