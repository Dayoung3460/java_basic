package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quantity to order");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[n];
        for (int i = 0; i < orders.length; i++) {
            System.out.println("Enter " + (i + 1) + "th order info" );
            System.out.println("product name: ");
            String productName = scanner.nextLine();
            System.out.println("price: ");
            int price = scanner.nextInt();
            System.out.println("quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // 입력 버퍼를 비우기 위함

            orders[i] = createOrder(productName, price, quantity);
        }
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
