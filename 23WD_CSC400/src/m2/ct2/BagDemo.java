package m2.ct2;

public class BagDemo {
	public static void main(String[] args) {
		ShoppingCart<Object> shoppingCart = new ShoppingCart<>();

		testAdd(shoppingCart);
		displayBag(shoppingCart);
	}

	public static void testAdd(ShoppingCart<Object> shoppingCart) {
		shoppingCart.add("Item 1");
		shoppingCart.add(13.7);
		shoppingCart.add("Item 2");
		shoppingCart.add(1234);
		shoppingCart.add("Item 3");
		shoppingCart.add("Item 4");
		shoppingCart.add("Item 5");
	}

	public static void displayBag(ShoppingCart<Object> shoppingCart) {
		Object[] bagContents = shoppingCart.toArray();
		System.out.println("\nContents of the bag:");
		for (Object item : bagContents) {
			System.out.println("- " + item);
		}
	}
}
