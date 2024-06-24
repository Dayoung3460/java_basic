package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = createOrder("tofu", 200, 1);
        orders[1] = createOrder("kimchi", 300, 2);
        orders[2] = createOrder("coke", 400, 3);

        printOrder(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("total price: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrder(ProductOrder[] orders) {
        for(ProductOrder order : orders) {
            System.out.println("product Name: " + order.productName + " price: " + order.price + " quantity: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for(ProductOrder order : orders) {
            totalAmount += (order.price * order.quantity);
        }
        return totalAmount;
    }
}
