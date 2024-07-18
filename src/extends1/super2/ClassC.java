package extends1.super2;

public class ClassC extends ClassB{
    public ClassC() {
        // super() 부모의 기본생성자 호출하는 코드 사용 불가
        // ClassB에는 기본 생성자(public ClassB(){})가 없잖아.
        // 자식에서 직접 호출해줘야함. 안해주면 컴파일 오류
        super(10, 20);
        System.out.println("ClassC constructor");
    }

}
