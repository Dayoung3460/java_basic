package extends1.overriding;

public class ElectricCar extends Car {
    // 어노테이션을 사용했을 대 overriding 조건을 만족시키지 않으면 컴파일 오류남
    // 오버라이딩 조건
    // 1. 부모 메서드와 같은 메서드 오버라이딩 가능
    // 2. 메서드 이름 같아야
    // 3. 메서드 매개변수 타입, 순서, 개수 같아야함
    // 4. 반환 타입 같아야함. 반환 타입의 하위 클래스는 가능
    // 5. 접근 제어자가 자식이 더 제한적일 수 없음
    // 6. static, final, private 메서드는 오버라이딩 불가
    // 7. 생성자는 오버라이딩 불가
    @Override
    public void move() {
        System.out.println("move fast");
    }

    public void charge() {
        System.out.println("charge");
    }

}
