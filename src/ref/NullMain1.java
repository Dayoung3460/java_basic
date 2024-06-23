package ref;

public class NullMain1 {
    public static void main(String[] args) {
        // null: 참조할 값이 없다는 뜻.
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        // 기존의 인스턴스는(new Data();) 이제 필요없어졌음.
        // jvm의 gc가 자동으로 메모리에서 제거해줌. 자바의 장!점!
        data = null;
        System.out.println("3. data = " + data);
    }
}
