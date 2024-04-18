package m8;

import java.util.Scanner;

public class Main {
	private Order orderSystem;
	private Display displaySystem;

	public Main() {
		orderSystem = new Order();
		displaySystem = new Display();
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\n***Order Management System***");
			System.out.println("1. Add a new order");
			System.out.println("2. Remove an order");
			System.out.println("3. Display order list");
			System.out.println("4. Exit");

			System.out.print("\nEnter your choice (1-4): ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.print("\nEnter customer last name: ");
				String lastName = scanner.nextLine();

				System.out.print("Enter order number: ");
				String orderNum = scanner.nextLine();

				System.out.print("Enter order total cost: ");
				double orderTotal = scanner.nextDouble();

				orderSystem.addOrder(lastName, orderNum, orderTotal);
				displaySystem.updateDisplays(orderSystem.getOrderQueue());
				displaySystem.printDisplays();

				break;
			case 2:
				Order.OrderItem removedOrder = orderSystem.removeOrder();

				if (removedOrder != null) {
					System.out.printf("\nRemoved order: Last Name: %s, Order Number: %s, Order Total: $%.2f%n",
							removedOrder.lastName, removedOrder.orderNum, removedOrder.orderTotal);
					displaySystem.updateDisplays(orderSystem.getOrderQueue());
				} else {
					System.out.println("\nNo orders to remove.");
				}

				break;
			case 3:
				displaySystem.printDisplays();
				break;
			case 4:
				scanner.close();
				System.out.println("\nExited the Order Management System. Bye.");
				return;
			default:
				System.out.println("\nInvalid choice. Please try again.");
				break;
			}
		}
	}

	public static void main(String[] args) {
		Main mainSystem = new Main();
		mainSystem.run();
	}
}
