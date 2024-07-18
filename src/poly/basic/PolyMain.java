package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();


        System.out.println("Parent -> Child");
        // 부모 변수가 자식 인스턴스를 참조: 다형적 참조
        // 반대는 불가
        Parent poly = new Child();
        poly.parentMethod();

//        Child child1 = new Parent();

        // poly 참조값은 Parent, Child 모두 들고 있음
        // parentMethod를 찾을 때 ploy의 타입이 Parent이기 때문에
        // Parent에서 부터 parentMethod 메서드를 찾기 시작함
        poly.parentMethod();
        // poly에는 Parent, Child 모두 들어있긴 하지만 타입이 Parent여서 Parent에 childMethod 없으면
        // 더 이상 찾을 곳이 없음(Parent의 부모가 있지 않은 이상)
        // childMethod 호출 불가.
        // 상속관계에서 부모에서 자식으로 내려와서 찾는 경우는 없음
        // Parent에 없다고 해서 Child로 내려와서 찾지 않음.
        // 그리고 일단 타입인 Parent에 자식 관련 내용이 하나도 없음
//        poly.childMethod();
    }
}
