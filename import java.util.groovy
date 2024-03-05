import java.util.Scanner;  
  
public class Main {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        int numStudents = scanner.nextInt();  
        scanner.nextLine(); // Consume the newline character  
  
        Student[] students = new Student[numStudents];  
  
        for (int i = 0; i < numStudents; i++) {  
            System.out.print("Enter student ID for student " + (i + 1) + ": ");  
            String studentID = scanner.nextLine();  
            System.out.print("Enter student name for student " + (i + 1) + ": ");  
            String studentName = scanner.nextLine();  
            System.out.print("Enter the number of extra activities for student " + (i + 1) + ": ");  
            int numExtraActivities = scanner.nextInt();  
            scanner.nextLine(); // Consume the newline character  
  
            students[i] = new Student(studentID, studentName, numExtraActivities);  
  
            System.out.println("Enter the extra activities for student " + (i + 1) + ":");  
            for (int j = 0; j < numExtraActivities; j++) {  
                System.out.print("Activity " + (j + 1) + ": ");  
                String activity = scanner.nextLine();  
                students[i].addExtraActivity(activity);  
            }  
        }  
  
        System.out.println("Student Details:");  
        for (Student student : students) {  
            System.out.println(student);  
        }  
  
        scanner.close();  
    }  
}