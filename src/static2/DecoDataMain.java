package static2;

import oop1.ValueData;

import static static2.DecoData.staticCall;

public class DecoDataMain {
    // 대표적인 static method.
    // 자바 실행할 때 main 객체 생성 안해도 실행이 됐었음. static이기 때문이지~~
    public static void main(String[] args) {
        System.out.println("1. static");
        DecoData.staticCall();

        System.out.println("2.instance");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        staticCall(data1);

        DecoData data3 = new DecoData();
        // 권장안함. 인스턴스 메서드 같잖우
        data3.staticCall();

        // static method는 static method만 호출가능
        test();

    }

    static void test() {
        System.out.println("static test method");
    }
}
