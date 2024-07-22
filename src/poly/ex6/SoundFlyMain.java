package poly.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

        flyAnimal(bird);
        flyAnimal(chicken);
    }

    private static void soundAnimal(AbstractAnimal abstractAnimal) {
        System.out.println("test start");
        abstractAnimal.sound();
        System.out.println("test end");
    }

    private static void flyAnimal(Fly fly) {
        System.out.println("test start");
        fly.fly();
        System.out.println("test end");
    }
}
