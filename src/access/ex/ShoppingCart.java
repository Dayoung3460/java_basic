package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;


    public void addItem(Item item) {
        if(itemCount >= items.length) {
            System.out.println("item이 10개 넘음");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        System.out.println("Cart items");

        for (int i = 0; i < itemCount; i++) {
            System.out.println("Item: " + items[i].getName() + " total: " + items[i].getTotalPrice());
        }

        System.out.println("Total price to pay: " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;

        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getTotalPrice();
        }

        return totalPrice;
    }
}
