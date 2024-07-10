package access;

public class BankAccount {
    // 데이터는 무조건 숨기기(private)
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    // 사용자 입장에서 필요한 기능만 public으로 열어두기
    public void deposit(int amount) {
        if(isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("not void amount");
        }
    }

    public void withdraw(int amount) {
        if(isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("not valid amount or lack of balance");
        }
    }

    public int getBalance() {
        return balance;
    }

    // 캡슐화 잘하기. 이 클래스에서만 사용하는 메소드이기 때문에 private으로 해줘야함.
    private boolean isAmountValid(int amount) {
        return amount > 0;
    }
}
