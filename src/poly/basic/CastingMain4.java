package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();

        Parent parent2 = new Parent();
        // parent2에는 Child instance가 없음. parent2 메모리상에 자식 타입은 존재하지 않음.
        // 근데 Child type 변수에 Parent type인 참조값을 대입하려하니 에러가 나는거.
        Child child2 = (Child) parent2; // 런타임 에러: ClassCastException
        child2.childMethod(); // 실행 불가
    }
}
