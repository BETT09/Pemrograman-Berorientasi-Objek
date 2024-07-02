import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];

        // Read the names and marks of each student
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter mark for student " + (i + 1) + ": ");
            double mark = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
            students[i] = new Student(name, mark);
        }

        // Calculate total and average marks
        double totalMarks = 0;
        for (Student student : students) {
            totalMarks += student.getMark();
        }
        double averageMarks = totalMarks / 5;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);

        // Find the best student
        Student bestStudent = students[0];
        for (Student student : students) {
            if (student.getMark() > bestStudent.getMark()) {
                bestStudent = student;
            }
        }
        System.out.println("Best Student: " + bestStudent.toString());

        // Ask the user for a grade and find the students with that grade
        System.out.print("Enter a grade (HD, DI, CR, PS, FL): ");
        String grade = scanner.nextLine().toUpperCase(); // Ensure input is uppercase

        System.out.println("Students with grade " + grade + ":");
        for (Student student : students) {
            if (student.getGrade().equals(grade)) {
                System.out.println(student.toString());
            }
        }

        scanner.close();
    }
}