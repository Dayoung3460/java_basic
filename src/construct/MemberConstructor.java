package construct;

public class MemberConstructor {
    String name;
    int age;
    int grade;

    MemberConstructor(String name, int age) {
        // this()는 생성자 코드에서 첫줄에만 작성 가능
        this(name, age, 50);
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
    }

    // contructor는 반환타입 없음.
    MemberConstructor(String name, int age, int grade) {
        System.out.println("name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
