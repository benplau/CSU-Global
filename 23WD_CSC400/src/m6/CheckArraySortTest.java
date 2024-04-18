package m6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckArraySortTest {

	public static void main(String[] args) {
		List<Integer> arrayOne = new ArrayList<>(Arrays.asList(3, 2, 8, 9, 5));
		List<Integer> arrayTwo = new ArrayList<>(Arrays.asList(3, 4, 6, 8, 9, 17));
		List<Integer> arrayThree = new ArrayList<>(Arrays.asList(1, 2, 3, 7, 9, 8, 12));

		System.out.println("Are the following arrays sorted in ascending order?\n");
		System.out.println("Array = " + arrayOne + ", " + "Sorted = " + CheckArraySort.isSorted(arrayOne));
		System.out.println("Array = " + arrayTwo + ", " + "Sorted = " + CheckArraySort.isSorted(arrayTwo));
		System.out.println("Array = " + arrayThree + ", " + "Sorted = " + CheckArraySort.isSorted(arrayThree));
	}

}


