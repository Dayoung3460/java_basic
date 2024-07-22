package poly.ex5;

// 클래스, 추상 클래스, 인터페이스는 프로그램 코드, 메모리 구조상 모두 똑같음. 모두 자바에서는 .class로 다루어짐
// 제약이 달라질뿐.
// 인터페이스는 순수 추상 클래스라고 보면 됨
// 순수 추상 클래스를 사용안하고 인터페이스를 사용해야하는 이유:
// 순수 추상 클래스에는 실행 가능한 메서드가 추가 될 수 있음. 해당 클래스를 만든 의도는 그냥 껍데기만 만드는건데
// 인터페이스는 실행 가능한 메서드 추가 자체를 원천 차단

public interface InterfaceAnimal {
    // interface에서 멤버변수 정의 가능
    // 무조건 public static final 변수로만. public static final 생략 가능. 클래스(인터페이스) 소속.
    public static final String value = "STRING_VALUE";

    // public abstract void sound(); 와 같음.
    void sound();

    void move();

}
