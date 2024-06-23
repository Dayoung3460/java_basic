package ref;

public class InitMain {
    public static void main(String[] args) {
        // 인스턴스 생성시 자동으로 멤버변수가 초기화됨
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1);
        System.out.println("value2 = " + data.value2);
    }
}
