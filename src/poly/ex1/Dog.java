package poly.ex1;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("dog sound");
    }

    @Override
    public void move() {
        System.out.println("dog move");
    }
}
