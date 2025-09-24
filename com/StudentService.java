package task2.com;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {

	private Scanner sc = new Scanner(System.in);

	public void addStudentDetails(ArrayList<Student> std) {
		System.out.print("Enter student Id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter student Name: ");
		String name = sc.nextLine();
		System.out.print("Enter student Marks: ");
		float marks = sc.nextFloat();

		std.add(new Student(id, name, marks));
		System.out.println("Student details successfully added!");
	}

	public void displayStudentsDetails(ArrayList<Student> std) {
		if (std.isEmpty()) {
			System.out.println("No students available.");
		} else {
			System.out.println("\n--- Student List ---");
			for (Student s : std) {
				// System.out.println("[ "+s.getStdId() + ", " + s.getStdName() + ", " +
				// s.getStdMarks()+" ]");
				System.out.println(s.toString());
			}
		}
	}

	public boolean updateStudentDetails(ArrayList<Student> std) {
		System.out.print("Enter student Id to update: ");
		int updateId = sc.nextInt();
		sc.nextLine();
		boolean found = false;

		for (Student s : std) {
			if (s.getStdId() == updateId) {
				System.out.print("Enter new Name: ");
				String newName = sc.nextLine();
				System.out.print("Enter new Marks: ");
				float newMarks = sc.nextFloat();

				s.setStdName(newName);
				s.setStdMarks(newMarks);

				System.out.println("Student details updated successfully!");
				found = true;
			}
		}
		return found;
	}
	public void deleteStudentDetails(ArrayList<Student> std) {
		 System.out.print("Enter student Id to delete: ");
         int deleteId = sc.nextInt();
         boolean removed = std.removeIf(s -> s.getStdId() == deleteId);

         if (removed) {
             System.out.println("Student removed successfully!");
         } else {
             System.out.println("Student not found!");
         }
	}
}
