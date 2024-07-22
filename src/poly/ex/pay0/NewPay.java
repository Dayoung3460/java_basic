package poly.ex.pay0;

public class NewPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("NewPay: " + amount);
        return true;
    }
}
