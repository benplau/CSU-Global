package m8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;

public class Display {
	private List<Order.OrderItem> sortByLastName;
	private List<Order.OrderItem> sortByOrderNum;

	public Display() {
		sortByLastName = new ArrayList<>();
		sortByOrderNum = new ArrayList<>();
	}

	public void printDisplays() {
		if (sortByLastName.size() == 0 || sortByOrderNum.size() == 0) {
			System.out.println("\nNo orders to display.");
		} else {
			System.out.println("\nOrders (sorted by last name, descending):");
			for (Order.OrderItem order : sortByLastName) {
				System.out.printf("Last Name: %s, Order Number: %s, Order Total: $%.2f%n", order.lastName,
						order.orderNum, order.orderTotal);
			}
			System.out.println("\nOrders (sorted by order number, descending):");
			for (Order.OrderItem order : sortByOrderNum) {
				System.out.printf("Last Name: %s, Order Number: %s, Order Total: $%.2f%n", order.lastName,
						order.orderNum, order.orderTotal);
			}
		}
	}

	public void updateDisplays(Deque<Order.OrderItem> orderQueue) {
		Order.OrderItem[] orderArray = orderQueue.toArray(new Order.OrderItem[0]);

		quicksort(orderArray, 0, orderArray.length - 1, (a, b) -> b.lastName.compareTo(a.lastName));
		sortByLastName = new ArrayList<>(Arrays.asList(orderArray));

		quicksort(orderArray, 0, orderArray.length - 1, (a, b) -> b.orderNum .compareTo(a.orderNum));
		sortByOrderNum = new ArrayList<>(Arrays.asList(orderArray));
	}

	private void quicksort(Order.OrderItem[] array, int low, int high, Comparator<Order.OrderItem> comparator) {
		if (low < high) {
			int partitionIndex = partition(array, low, high, comparator);
			quicksort(array, low, partitionIndex - 1, comparator);
			quicksort(array, partitionIndex + 1, high, comparator);
		}
	}

	private int partition(Order.OrderItem[] array, int low, int high, Comparator<Order.OrderItem> comparator) {
		Order.OrderItem pivot = array[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (comparator.compare(array[j], pivot) <= 0) {
				i++;
				swap(array, i, j);
			}
		}

		swap(array, i + 1, high);
		return i + 1;
	}

	private void swap(Order.OrderItem[] array, int i, int j) {
		Order.OrderItem temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}