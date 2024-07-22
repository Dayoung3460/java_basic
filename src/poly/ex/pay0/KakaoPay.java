package poly.ex.pay0;

public class KakaoPay implements Pay {

    @Override
    public boolean pay(int amount) {
        System.out.println("kakaopay: " + amount);
        return true;
    }
}
