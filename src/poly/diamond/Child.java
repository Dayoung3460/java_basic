package poly.diamond;

// 다중 구현 가능
public class Child implements InterfaceA, InterfaceB {


    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    // 인터페이스에는 메서드 내용 자체가 없기 때문에 구현해야하는 인터페이스의 메서드 이름이 같은건 문제되지 않음
    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }
}
