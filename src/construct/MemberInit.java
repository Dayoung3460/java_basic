package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 파라미터 없는 생성자는 기본생성자가 자동으로 생성됨
//    MemberInit() {
//
//    }

    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
