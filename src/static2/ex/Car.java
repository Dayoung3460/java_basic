package static2.ex;

public class Car {
    private static int count;
//    private String name;

    public Car(String name) {
        System.out.println("car name: " + name);
//        this.name = name;
        count++;

    }

    public static void showTotalCars() {
        System.out.println("total count: " + count);
    }
}
