package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("before method calling: a = " + a);

        changePrimitive(a);
        System.out.println("after method calling: a = " + a);

    }

    // static 메서드
    // 클래스 레벨에서 동작
    // 객체의 특정 인스턴스에 속하지 않음
    // 클래스가 메모리에 로드될 때 한 번만 메모리에 할당됨.
    // 여러 인스턴스가 static 메소드를 호출해도 메서드 자체는 한 번만 로드됨.
    // 객체 상태와 무관한 기능 제공하는 유틸리디 메서드 정의할 때 유용
    // 수학적 계산, 문자열 조작 등
    // 메서드 공용화: 특정 메서드가 모든 인스턴스에서 동일한 동작을 해야 할 때 사용됨
    public static void changePrimitive(int x) {
        // 변수에 값을 대입하는 것은 항상 값을 복사해서 대입함.
        // a와 x 각각 10을 가지고 있음.
        x = 20;

        // 메서드가 종료되면 매개변수 x는 메모리상에서 제거됨
    }
}
