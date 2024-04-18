package m7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>(Arrays.asList(3, 2, 1, 8, 9, 4, 10, 5, 7, 6, 2, 5, 3, 8));

		System.out.println("Original Array:");
		System.out.println(arr);

		mergeSort(arr);

		System.out.println("Sorted Array:");
		System.out.println(arr);
	}

    public static void mergeSort(List<Integer> arr) {
        if (arr.size() <= 1)
            return;

        int mid = arr.size() / 2;
        List<Integer> left = new ArrayList<>(arr.subList(0, mid));
        List<Integer> right = new ArrayList<>(arr.subList(mid, arr.size()));

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    public static void merge(List<Integer> arr, List<Integer> left, List<Integer> right) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j))
                arr.set(k++, left.get(i++));
            else
                arr.set(k++, right.get(j++));
        }

        while (i < left.size())
            arr.set(k++, left.get(i++));

        while (j < right.size())
            arr.set(k++, right.get(j++));
    }
}





