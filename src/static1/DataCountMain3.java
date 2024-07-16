package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        // 힙 영역에 인스턴스가 저장됨(총 3개 data1, data2, data3)
        Data3 data1 = new Data3("A");
        // 클래스 이름에서 바로 static 변수 접근 가능
        System.out.println("A count = " + Data3.count);

        Data3 data2  = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3  = new Data3("C");
        System.out.println("C count = " + Data3.count);
    }
}
