package static1;

public class Data3 {
    public String name;
    // static 변수, 정적 변수, 클래스 변수, 공용 변수
    // static: method 영억에서 관리됨.
    // 클래스가 특별히 관리하는 변수.
    // static 변수는 처음에 하나만 생성됨.
    public static int count;

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
