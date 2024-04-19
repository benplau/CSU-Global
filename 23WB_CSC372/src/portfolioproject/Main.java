package portfolioproject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Student> studentList = new LinkedList<>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter student data:");

		inputLoop:
		while (true) {

			System.out.print("Name: ");
			String name = scanner.nextLine();

			System.out.print("Address: ");
			String address = scanner.nextLine();

            double gpa;
			while (true) {
				System.out.print("GPA: ");
				String input = scanner.nextLine();
				try {
					gpa = Double.parseDouble(input);
					break;
				} catch (NumberFormatException e) {
					System.out.println("Invalid GPA. Please enter a numeric value.");
				}
			}

			Student student = new Student(name, address, gpa);
			studentList.add(student);

			System.out.print("Continue entering student data? Y/N: ");
			while (true) {
				String next = scanner.nextLine();
				if (next.equalsIgnoreCase("Y")) {
					break;
				} else if (next.equalsIgnoreCase("N")) {
					break inputLoop;
				} else {
					System.out.println("Please enter either Y for yes or N for no.");
					System.out.print("Y/N: ");
				}
			}
		}

		scanner.close();

		Collections.sort(studentList, Comparator.comparing(Student::getName));

		try (BufferedWriter writer = new BufferedWriter(new FileWriter("student_data.txt"))) {
			writer.write("Student Data for " + studentList.size() + " Student(s)");
			writer.write("\n\n");
			for (Student student : studentList) {
				writer.write("Name: " + student.getName() + "\n");
				writer.write("Address: " + student.getAddress() + "\n");
				writer.write("GPA: " + student.getGpa() + "\n");
				writer.write("\n");
			}
			System.out.println("Data has been written to student_data.txt.");
		} catch (IOException e) {
			System.out.println("An error occurred while writing the data to the text file.");
			e.printStackTrace();
		}
	}
}
