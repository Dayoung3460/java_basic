package oop1;

public class ValueData {
    int value;

    // method는 객체가 생성되어야 호출될 수 있는데 static이 붙으면 객체 생성안해도 메서드 호출 가능
    void add() {
        value++;
        System.out.println("value = " + value);
    }
}
