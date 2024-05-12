package class1;

public class classStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"student1", "student2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for(int i = 0; i < studentNames.length; i++) {
            System.out.println("name: " + studentNames[i] + " age: " + studentAges[i] + " grade: " + studentGrades[i]);
        }

    }
}
