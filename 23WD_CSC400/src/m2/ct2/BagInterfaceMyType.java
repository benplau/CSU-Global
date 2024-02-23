package m2.ct2;

public interface BagInterfaceMyType<MyType> {
	void add(MyType newEntry);

	MyType[] toArray();

	boolean isFull();
}