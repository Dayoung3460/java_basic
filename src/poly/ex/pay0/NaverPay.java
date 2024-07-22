package poly.ex.pay0;

public class NaverPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("NaverPay: " + amount);
        return true;
    }
}
