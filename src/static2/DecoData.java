package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        // static 메서드에서는 정적 변수, 정적 메소드만 사용 가능
        staticValue++;
        staticMethod();

        // instance 변수, instance 메서드 접근 불가
        // 인스턴스를 생성해서 메모리 힙 영역에 들어가고 인스턴스 참조값을 알아야 접근 가능
        // 클래스 소속인 staticCall는 알 수 없음.
//        instanceValue++;
//        instanceMethod();
    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    // instance 생성해야 instanceCall() 가능
    public void instanceCall() {
        // 본인 클래스의 변수와 메서드는 당연히 사용 가능
//        DecoData.staticValue++ 와 같음
        staticValue++;
        staticMethod();

        // 본인 인스턴스의 변수와 메서드 사용 가능
        instanceValue++;
        instanceMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
