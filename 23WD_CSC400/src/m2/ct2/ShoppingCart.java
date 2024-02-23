package m2.ct2;

public class ShoppingCart<MyType> implements BagInterfaceMyType<MyType> {
	private MyType[] myBag;
	private int numberofProducts;
	private static final int Default_Capacity = 5;

	@SuppressWarnings("unchecked")
	public ShoppingCart() {
		myBag = (MyType[]) new Object[Default_Capacity];
		numberofProducts = 0;
	}

	public boolean isFull() {
		return numberofProducts >= Default_Capacity;
	}

	public void add(MyType newEntry) {
		if (!isFull()) {
			myBag[numberofProducts] = newEntry;
			numberofProducts++;
		} else {
			System.out.println("The shopping cart has reached its maximum capacity. The item [ " + newEntry
					+ " ] cannot be added.");
		}
	}

	@SuppressWarnings("unchecked")
	public MyType[] toArray() {
		MyType[] result = (MyType[]) new Object[numberofProducts];
		for (int i = 0; i < numberofProducts; i++) {
			result[i] = myBag[i];
		}
		return result;
	}

}
