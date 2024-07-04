package construct;

public class MemberConstructor {
    String name;
    int age;
    int grade;

    // contructor는 반환타입 없음.
    MemberConstructor(String name, int age, int grade) {
        System.out.println("name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
