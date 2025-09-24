package task2.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Student_Task2 {
    public static void main(String[] args) {
        ArrayList<Student> std = new ArrayList<>();
        StudentService service=new StudentService();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter an option: ");
            int option = sc.nextInt();
            sc.nextLine(); 

            switch (option) {
                case 1: 
                      service.addStudentDetails(std);
                    break;

                case 2: 
                    service.displayStudentsDetails(std);
                    break;

                case 3: 
                    boolean found=service.updateStudentDetails(std);
                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4: 
                     service.deleteStudentDetails(std);
                    break;

                case 5: 
                    running = false;
                    System.out.println("Exiting Student Management System...");
                    break;

                default:
                    System.out.println("Invalid option. Try again!");
            }
        }
        sc.close();
    }
}
