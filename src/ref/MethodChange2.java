package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("dataA = " + dataA.value); // 10
        changeReference(dataA);
        System.out.println("dataA = " + dataA.value); // 20
    }

    // dataA의 참조값이 dataX에 복사됨.
    // dataA와 dataX가 바라보는 Data 인스턴스의 참조값이 같음
    // dataX의 value와 dataA의 value가 가지고 있는 값이 같음.
    public static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}
