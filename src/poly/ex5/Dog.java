package poly.ex5;

// 인터페이스를 구현할 때는 implements 키워드 사용
// 인터페이스에서 상속받을 기능이 없음 -> '구현'
// 상속, 구현 자바 내에서 메모리 구조는 똑같
public class Dog implements InterfaceAnimal {

    @Override
    public void sound() {
        System.out.println("dog sound");
    }

    @Override
    public void move() {
        System.out.println("dog move");
    }
}
