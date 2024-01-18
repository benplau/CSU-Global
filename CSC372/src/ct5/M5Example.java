package ct5;

public class M5Example {
    public static int sumArray(int[] arr, int index) {

    	if (index >= arr.length) {
            return 0;
        }
    	System.out.println("Adding " + arr[index] + " to the sum");
    	
        return arr[index] + sumArray(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 7, 8};
        int sum = sumArray(array, 0);
        System.out.println("Sum of the array is: " + sum);
    }
}





