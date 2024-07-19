package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);
        Parent parent2 = new Child();
        call(parent2);

    }

    private static void call(Parent parent) {
        // parent2에는 Child 인스턴스를 참조하고 있음
        if (parent instanceof Child) {
            System.out.println("child instance");
            ((Child) parent).childMethod();
        } else {
            System.out.println("not child instance");
        }
    }
}
