package m2.ct2;

public class BagDemo {
    public static void main(String[] args) {
        ShoppingCart<Item> shoppingCart = new ShoppingCart<>();

        testAdd(shoppingCart);
        displayBag(shoppingCart);
    }

    public static void testAdd(ShoppingCart<Item> shoppingCart) {
        shoppingCart.add(new Item("Item 1", 12.34));
        shoppingCart.add(new Item("Item 2", 23.45));
        shoppingCart.add(new Item("Item 3", 34.56));
        shoppingCart.add(new Item("Item 4", 45.67));
        shoppingCart.add(new Item("Item 5", 56.78));
    }

    public static void displayBag(ShoppingCart<Item> shoppingCart) {
        Object[] bagContents = shoppingCart.toArray();
        System.out.println("\nContents of the bag:");
        double totalPrice = 0; 
        for (Object item : bagContents) {
            if (item instanceof Item) {
                Item currentItem = (Item) item;
                System.out.println("  " + currentItem.getName() + "  $" + currentItem.getPrice());
                totalPrice += currentItem.getPrice();
            }
        }
        System.out.println("  Total Price:" + "  $" + totalPrice);
    }

    public static class Item {
        private String name;
        private double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }
}