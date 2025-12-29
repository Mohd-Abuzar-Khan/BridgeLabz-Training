import java.util.Scanner;

//Program Name: BusAttendanceSystem 
//Description: Takes attendance of students and displays the final report.
 
public class BusAttendanceSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Total number of students
        int numberOfStudents = 10;

        // Student name list
        String[] studentList = {
            "Arif", "Ansh", "Ananya", "Abuzar", "Aneek",
            "Abhay", "Abhishek", "Pranshi", "Laxmi", "Dhruv"
        };

        // Array to store attendance status
        String[] attendance = new String[numberOfStudents];

        System.out.println("----------- Bus Attendance System ----------\n");
		
		int index = 0; // used because for-each does not give index

        // Taking attendance using for-each loop
        for (String student : studentList) {

            System.out.println("Mark attendance for: " + student);
            System.out.println("1. Present");
            System.out.println("2. Absent");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    attendance[index] = "Present";
                    break;

                case 2:
                    attendance[index] = "Absent";
                    break;

                default:
                    System.out.println("Invalid choice! Choose from above option");
                    attendance[index] = " ";
            }

            index++; // move to next student
            System.out.println();
        }

        // Display attendance report
        System.out.println("\n-------- Attendance Report ------");
        System.out.println("Student Name\tAttendance");

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(studentList[i] + "\t\t" + attendance[i]);
        }

        sc.close();
    }
}
