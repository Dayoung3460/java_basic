package class1;

import java.sql.Struct;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "student1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "student2";
        student2.age = 16;
        student2.grade = 100;

        Student[] students = new Student[]{student1, student2};

        for (Student student : students) {
            System.out.println("name: " + student.name);

        }

    }

}
