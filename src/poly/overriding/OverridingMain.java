package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value: " + child.value);
        child.method();

        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value: " + parent.value);
        parent.method();

        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value: " + poly.value);
        // poly는 Parent 타입이니까 method()가 Parent에 있는지부터 먼저 찾음
        // 근데 Parent에 있는 method()가 자식에서 오버라이딩이 됐네?
        // 그러면 자식의 오버라이딩된 method()를 찾아서 호출함.
        // ** 오버라이딩된 메서드는 항상 우선권을 가짐 **
        // 손자에서 메서드를 오버라이딩하고 있으면 손자 메서드가 호출됨
        poly.method();
    }
}
