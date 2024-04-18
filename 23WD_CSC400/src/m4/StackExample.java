package m4;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("One");
        stack.push("Two");
        stack.push("Three");

        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        String topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);
    }
}




