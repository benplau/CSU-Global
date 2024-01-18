package ct5;

import java.util.Scanner;

public class NumberSum {

	public static int calculateSum(int[] numbers, int index) {
		if (index >= numbers.length) {
			return 0;
		}
		return numbers[index] + calculateSum(numbers, index + 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numCount = 5;
		int[] numberList = new int[numCount];

		System.out.println("Enter " + numCount + " numbers:");

		for (int i = 0; i < numCount; i++) {
			System.out.print("Number " + (i + 1) + ": ");
			numberList[i] = scanner.nextInt();
		}

		int sum = calculateSum(numberList, 0);
		System.out.println("Sum of the numbers is: " + sum);

		scanner.close();
	}

}
