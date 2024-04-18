package m2.ct2;

public class ShoppingCart<MyType> implements BagInterfaceMyType<MyType> {
    private MyType[] myBag;
    private int numberOfProducts;
    private static final int DEFAULT_CAPACITY = 5;

    @SuppressWarnings("unchecked")
	public ShoppingCart() {
        myBag = (MyType[]) new Object[DEFAULT_CAPACITY];
        numberOfProducts = 0;
    }

    public boolean isFull() {
        return numberOfProducts >= DEFAULT_CAPACITY;
    }

    public void add(MyType newEntry) {
        if (!isFull()) {
            myBag[numberOfProducts] = newEntry;
            numberOfProducts++;
        } else {
            System.out.println("The shopping cart has reached its maximum capacity. The item [ " + newEntry
                    + " ] cannot be added.");
        }
    }

    public MyType[] toArray() {
        return this.myBag;
    }
}