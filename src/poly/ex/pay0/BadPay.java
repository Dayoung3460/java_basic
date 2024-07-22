package poly.ex.pay0;

public class BadPay implements Pay {
    @Override
    public boolean pay(int amount) {
        return false;
    }
}
