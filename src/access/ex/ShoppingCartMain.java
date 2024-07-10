package access.ex;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("garlic", 2000, 2);
        Item item2 = new Item("lettuce", 3000, 4);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        shoppingCart.displayItems();
    }
}
