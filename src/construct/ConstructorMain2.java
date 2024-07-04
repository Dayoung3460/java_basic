package construct;

public class ConstructorMain2 {
    public static void main(String[] args) {
        // 생성자 오버로딩
        MemberConstructor member1 = new MemberConstructor("user1", 15, 90);
        MemberConstructor member2 = new MemberConstructor("user2", 16);

        MemberConstructor[] members = {member1, member2};

        for (MemberConstructor member : members) {
            System.out.println("member.grade = " + member.grade);
        }
    }
}
