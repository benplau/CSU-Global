package m8;

import java.util.Deque;
import java.util.LinkedList;

public class Order {
    private Deque<OrderItem> orderQueue;

    public Order() {
        orderQueue = new LinkedList<>();
    }

    public void addOrder(String lastName, String orderNum, double orderTotal) {
        orderQueue.offer(new OrderItem(lastName, orderNum, orderTotal));
    }

    public OrderItem removeOrder() {
        return orderQueue.pollFirst();
    }

    public Deque<OrderItem> getOrderQueue() {
        return orderQueue;
    }

    public static class OrderItem {
        String lastName;
        String orderNum;
        double orderTotal;

        OrderItem(String lastName, String orderNum, double orderTotal) {
            this.lastName = lastName;
            this.orderNum = orderNum;
            this.orderTotal = orderTotal;
        }
    }
}
