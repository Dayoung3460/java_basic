package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        // 인터페이스 객체 생성 불가
//        InterfaceAnimal interfaceAnimal = new InterfaceAnimal();
        Dog dog = new Dog();

        soundAnimal(dog);
    }

    private static void soundAnimal(InterfaceAnimal interfaceAnimal) {
        interfaceAnimal.sound();
    }
}
