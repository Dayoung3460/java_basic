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

        Data3 data4 = new Data3("D");
        // static 변수를 인스턴스 통해서 접근하는건 추천하지 않음.
        // 인스턴스 변수에 접근하는 것 처럼 보일 수 있기 때문
        System.out.println(data4.count);

        // 클래스에서 바로 접근 하는건 아 클래스 변수구나 static 변수구나 바로 알 수 있음
        System.out.println(Data3.count);
    }
}
