package m2.ct2;

public interface BagInterfaceMyType<T> {
    void add(T newEntry);

    T[] toArray();

    boolean isFull();
}