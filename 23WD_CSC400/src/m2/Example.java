package m2;

public class Example {
	public static void main(String[] args) {
		// Declare and initialize an array
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };

		// Retrieves the first element of the array
		int firstNumber = array[0];
		// Retrieves the length of the array
		int arrayLength = array.length;

		// Print out some information about the array
		System.out.println("First number: " + firstNumber);
		System.out.println("Array length: " + arrayLength);

		// Replace an items in the array
		array[0] = 9;
		array[5] = 1;
		
		System.out.print("Modified array: ");
		// Print out the elements of the array
		for (int i = 0; i < array.length; i++) {
		    System.out.print(array[i]);
		}

	}
}



