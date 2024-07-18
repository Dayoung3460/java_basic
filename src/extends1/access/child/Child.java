package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        publicValue = 1;
        protectedValue = 1; // 상속관계이기 때문에 다른 패키지에서 접근 가능
//        defaultValue = 1;

        publicMethod();
        protectedMethod();
//        defaultMethod();

        // printParent 안에 있는 애들은 모두 호출 가능. 본인 클래스 안에서 동작하기 때문에
        printParent();
    }

}
