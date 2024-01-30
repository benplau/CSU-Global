package ct6;

import java.util.ArrayList;
import java.util.Comparator;

public class MergeSort {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(6, "Student 6", "Address 6"));
        students.add(new Student(5, "Student 5", "Address 5"));
        students.add(new Student(1, "Student 1", "Address 1"));
        students.add(new Student(8, "Student 8", "Address 8"));
        students.add(new Student(7, "Student 7", "Address 7"));
        students.add(new Student(4, "Student 4", "Address 4"));
        students.add(new Student(10, "Student 10", "Address 10"));
        students.add(new Student(3, "Student 3", "Address 3"));
        students.add(new Student(9, "Student 9", "Address 9"));
        students.add(new Student(2, "Student 2", "Address 2"));

        mergeSort(students, new StudentComparator());

        for (Student student : students) {
            System.out.println("Roll Number: " + student.getRollno() +
                    ", Name: " + student.getName() +
                    ", Address: " + student.getAddress());
        }
    }

    public static <T> void mergeSort(ArrayList<T> list, Comparator<? super T> comparator) {
        if (list.size() <= 1) {
            return;
        }

        int mid = list.size() / 2;
        ArrayList<T> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<T> right = new ArrayList<>(list.subList(mid, list.size()));

        mergeSort(left, comparator);
        mergeSort(right, comparator);

        merge(list, left, right, comparator);
    }

    private static <T> void merge(ArrayList<T> list, ArrayList<T> left, ArrayList<T> right,
                                  Comparator<? super T> comparator) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (comparator.compare(left.get(i), right.get(j)) <= 0) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            list.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            list.set(k++, right.get(j++));
        }
    }
}
