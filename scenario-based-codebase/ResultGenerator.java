import java.util.Scanner;

public class SmartCard {

    // Method to calculate average marks
    public static void calculateAverage(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        double avg = (double) sum / arr.length;

        System.out.println("Average Marks: " + avg);

        if (avg >= 90) {
            System.out.println("Grade: A");
        } else if (avg >= 75) {
            System.out.println("Grade: B");
        } else if (avg >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ind = 0;
        String[] subjects = {"Math", "Hindi", "Physics", "Chemistry", "Biology"};
        int[] arr = new int[5];

        for (String subject : subjects) {
            System.out.print("Enter the marks you scored in " + subject + ": ");
            arr[ind] = sc.nextInt();
            ind++;
        }

        calculateAverage(arr);

        sc.close();
    }
}
