package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent poly = new Child();

        // 일시적 다운캐스팅: 해당 메서드를 호출하는 순간만 다운캐스팅
        // 연산자 우선순위가 ploy.childMethod()이라서
        // ploy를 다운케스팅 한 후에 childMethod 호출하려면 괄호 해줘야함
        // 당연히 poly는 Parent 타입
        // 자바에서는 변수안에 있는 뭔가를 바꾸는건 불가. 대입밖에 방법 없음
        ((Child) poly).childMethod();
    }
}
