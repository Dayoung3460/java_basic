package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        // this 생략 가능
        nameField = nameParameter;
    }
}
