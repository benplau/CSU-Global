package m8;

import java.util.LinkedList;

public class Example {
	private LinkedList<Object> items;

	public Example() {
		items = new LinkedList<>();
	}

	public boolean isEmpty() {
		return items.isEmpty();
	}

	public void enqueue(Object item) {
		items.addLast(item);
	}

	public Object dequeue() {
		if (isEmpty()) {
			throw new IndexOutOfBoundsException("Queue is empty");
		}
		return items.removeFirst();
	}

	public int size() {
		return items.size();
	}

	public static void main(String[] args) {
		Example queue = new Example();

		queue.enqueue("Item1");
		queue.enqueue("Item2");
		queue.enqueue("Item3");

		System.out.println("Dequeue:");
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println("\nIs the current queue empty? " + queue.isEmpty());

		queue.enqueue("Item4");

		System.out.println("\nSize of the current queue: " + queue.size());
	}
}



