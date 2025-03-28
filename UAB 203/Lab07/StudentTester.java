package Lab07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is the main class.
 * It reads the document name studentList.txt to get the information calculate the final grade.
 * After calculating the grade it grade it writes the information to a new file studentGrades.
 */

public class StudentTester {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // ArrayList to store Student objects
        ArrayList<Student> students = new ArrayList<>();

        try {
            File file = new File("studentList.txt");
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] data = line.split(",");
                
                String fullName = data[0];
                
                // Using Scanner to integers
                Scanner dataScanner = new Scanner(data[1]);
                int exam1 = 0;
                if (dataScanner.hasNextInt()) {
                    exam1 = dataScanner.nextInt();
                }
                
                dataScanner = new Scanner(data[2]);
                int exam2 = 0;
                if (dataScanner.hasNextInt()) {
                    exam2 = dataScanner.nextInt();
                }
                
                dataScanner = new Scanner(data[3]);
                int finalExam = 0;
                if (dataScanner.hasNextInt()) {
                    finalExam = dataScanner.nextInt();
                }
                
                // Split the full name into first name and last name
                String[] nameParts = fullName.split(" ");
                String lastName = nameParts[nameParts.length - 1];
                StringBuilder firstName = new StringBuilder();
                for (int i = 0; i < nameParts.length - 1; i++) {
                    firstName.append(nameParts[i]);
                    if (i < nameParts.length - 2) {
                        firstName.append(" ");
                    }
                }
                
                // Create a new Student object with initial values
                Student student = new Student(firstName.toString(), lastName, exam1, exam2, finalExam, 0.0, "");
                
                // Calculate and set the final grade and letter grade
                student.setFinalGrade();
                student.setLetterGrade();
                
                // Add the student to the ArrayList
                students.add(student);
            }
            
            scan.close();
            
            // PrintWritter to new file
            try {
                PrintWriter writer = new PrintWriter("studentGrades.txt");
                
                System.out.println("Student Grades:");
                System.out.println("---------------");
                
                for (Student student : students) {
                    String outputLine = student.getName() + " " + student.getLastName() + " - Final Grade: " + String.format("%.2f", student.getFinalGrade()) + ", Letter Grade: " + student.getLetterGrade();
                    System.out.println(outputLine);
                    
                    writer.println(outputLine);
                }
                
                writer.close();
                System.out.println("\nGrades have been written to studentGrades.txt");
                
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred while creating the output file: " + e.getMessage());
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        
    }
}