import java.util.Scanner;

public class VotingEligibility {

    // Createing a method to generate and store ages of student in array
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            // Random 2-digit age between 10 and 99
            ages[i] = (int)(Math.random() * 90) + 10;
        }
        return ages;
    }

    //Creating a method to return an 2D array to check wheter an person is eligible or not with their age
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
			
			//Eligibilty check
            if (ages[i] < 0) {
                result[i][1] = "false";
            }
            else if (ages[i] >= 18) {
                result[i][1] = "true";
            }
            else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    //
    public static void displayResult(String[][] data) {

        System.out.println("\nAge\tCan Vote");
        System.out.println("");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input for number of students and method calls
        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        int[] ages = generateAges(n);
        String[][] result = checkVotingEligibility(ages);

        // Display
        displayResult(result);

        sc.close();
    }
}
