import java.util.ArrayList;
import java.util.List;

public class Hello {
    static int num[] = new int[]{1,2,3};

    public static void main(String[] args) {
        int nums[] = new int[]{1,2,5};

        for (int num: nums){
            System.out.println(num);
        }

        Student student[] = new Student[2];
        student[0] = new Student("Luis", "1");
        student[1] = new Student("Uriel", "2");

        for(Student s: student) {
            System.out.println(s.name);
        }

        List<String> colors = new ArrayList<>();
        for (int i=1; i < 10; i++) {
            colors.add("Color "+i);
        }

        System.out.println(colors.toString());

    }
}



class Student {
    public String name;
    public String grade;
    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
}
