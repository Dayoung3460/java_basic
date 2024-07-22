package poly.car0;

public class Driver {
    //    private K3Car k3Car = null;
//    private Model3Car model3Car = null;
    private Car car = null;

    public void setCar(Car car) {
        this.car = car;
    }


    public void drive(Car car) {
        System.out.println("drive");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
