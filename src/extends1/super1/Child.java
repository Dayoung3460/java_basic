package extends1.super1;

public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        // value에 this나 super 생략하면 본인 클래스에서 찾고 없으면 부모로 올라감
        System.out.println("value = " + value);
        System.out.println("this value = " + this.value);
        // super: 부모 타입에서 찾음
        System.out.println("super value = " + super.value);

        this.hello();
        super.hello();
    }



}
