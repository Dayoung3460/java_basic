package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        // ElectricCar에 overriding된 move 메서드가 있기 때문에 부모까지 올라가지 않음.
        electricCar.move();

        GasCar gasCar = new GasCar();
        gasCar.move();
    }
}

