package poly.ex1;

public class AnimalSoundMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        // array는 같은 타입의 요소들만 가질 수 있음
        Animal[] animalArr = {dog, cat, caw};
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }

        for (Animal animal : animalArr) {
            moveAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("test start");
        animal.sound();
        System.out.println("test end");
    }

    private static void moveAnimal(Animal animal) {
        System.out.println("move start");
        animal.move();
        System.out.println("move end");
    }
}
