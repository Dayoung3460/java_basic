package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
//        data = new Data();

        data.value = 10;
        System.out.println(data.value);

        // final이 data 참조형 변수에 사용된거라 data의 참조값만 바꿀 수 없지
        // data 안의 value 인스턴스 변수값은 변경 가능함
        data.value = 20;
        System.out.println(data.value);
    }
}
