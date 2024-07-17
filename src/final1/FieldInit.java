package final1;

public class FieldInit {
    // final 필드를 바로 초기화할 때 static 사용하는 것이 효과적
    // 어차피 final이면 못바꾸는 값인데 객체를 생성할 때마다 해당 필드가 생성될 필요없음.
    // static 사용하면 메서드 영역에 한 번만 저장되기 때문에 중복 저장(힙 영역에) 피할 수 있음.
    // static final -> 상수 constant
    // 대문자, 언더스코어 사용함. 관례
    static final int CONST_VALUE = 10;
    final int value = 10;

//    public FieldInit(int value) {
//        this.value = 20;
//    }
}
