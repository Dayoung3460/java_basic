package extends1.ex3;

public class CarMain {
    public static void main(String[] args) {
        // 상속된 객체를 생성할 때 부모 객체도 같이 생성됨
        // electricCar 참조값 하나의 공간에 자식, 부모 클래스 정보 다 구분돼서 들어있음
        ElectricCar electricCar = new ElectricCar();
        // electricCar에서 move()를 접근해야하는데 electricCar 안에는 ElectricCar, Car 두 개가 있음
        // 이 중에 어떤거부터 선택해서 찾을지 기준은 electricCar의 타입을 보면됨 -> ElectricCar
        // ElectricCar에 먼저 접근해서 move()를 찾음
        electricCar.charge();
        // ElectricCar에 move()가 없으면 부모 타입으로 올라가서 찾음
        electricCar.move();
        electricCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor();
    }
}

