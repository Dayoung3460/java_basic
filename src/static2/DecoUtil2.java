package static2;

public class DecoUtil2 {
    // 정적 메서드. class method. static method.
    // 인스터스 생성없이 바로 클래스에서 접근 가능
    public static String deco(String str) {
        String result = "*" + str + "*";
        return result;
    }
}
