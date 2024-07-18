package extends1.super2;

public class ClassB extends ClassA{
    public ClassB(int a) {
        // ClassB의 객체를 만들 때 부모인 ClassA 객체도 같이 만들어져야함
        // 그래서 자식의 생성자 안에 부모 생상자 만드는 코드가 있어야함
        // 하지만 기본 생성자(내용없는 생성자)는 생략이 가능
//        super();
        System.out.println("classB constructor a = " + a);
    }

    public ClassB(int a, int b) {
        // 기본 생성자 생략 가능
        super();
        System.out.println("ClassB constructor a = " + a + " b = " + b);
    }
}
