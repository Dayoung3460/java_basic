package poly.ex1;

public class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat sound");
    }

    @Override
    public void move() {
        System.out.println("Cat move");
    }
}
