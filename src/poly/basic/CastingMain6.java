package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);
        Parent parent2 = new Child();
        call(parent2);

    }

    private static void call(Parent parent) {
        // parent2에는 Child 인스턴스를 참조하고 있음
        // parent instanceof Child 가 true인 경우 parent를 Child로 다운캐스팅 한 변수를 알아서 설정해줌 -> child
        if (parent instanceof Child child) {
            System.out.println("child instance");
            child.childMethod();
        } else {
            System.out.println("not child instance");
        }
    }
}
