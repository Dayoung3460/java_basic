package extends1.super2;

public class Super2Main {
    public static void main(String[] args) {
        // ClassA <- ClassB <- ClassC 부모부터 실행돼서 내려오는거기 때문에 초기화도 부모부터 어루어짐
        ClassC classC = new ClassC();
    }
}
