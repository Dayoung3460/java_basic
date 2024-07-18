package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();

        // 다운캐스팅: 부모 타입을 자식 타입으로 내림
        // poly 참조값을 복사해서 Child 타입으로 바꾼 후에 child 변수에 대입.
        // 참조값을 복사하는거라 poly의 타입은 Parent 그대로임.
        Child child = (Child) poly;
        child.childMethod();
    }
}
