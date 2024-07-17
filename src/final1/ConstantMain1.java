package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("Max users: " + Constant.MAX_USER);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("users: " + currentUserCount);
        if(currentUserCount > Constant.MAX_USER) {
            System.out.println("move to wait list");
        } else {
            System.out.println("move to user list");
        }
    }
}
