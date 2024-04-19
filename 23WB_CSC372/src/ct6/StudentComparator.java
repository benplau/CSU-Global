package ct6;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student stu1, Student stu2) {
        return Integer.compare(stu1.getRollno(), stu2.getRollno());
    }
}
