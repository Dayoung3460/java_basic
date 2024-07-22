package poly.ex.pay0;

import java.util.Scanner;

public class PayMain0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {
            System.out.println("enter payment method");
            String payOption = scanner.nextLine();

            if (payOption.equals("exit")) {
                System.out.println("exit");
                return;
            }

            System.out.println("enter amount");
            int amount = scanner.nextInt();
            scanner.nextLine();

            payService.processPay(payOption, amount);
        }
    }
}
