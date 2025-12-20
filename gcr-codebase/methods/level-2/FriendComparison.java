import java.util.Scanner;

public class FriendComparison {

    // Method to find the youngest friend
    public static void findYoungest(int[] ages, String[] names) {
        int minAgeIndex = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }

        System.out.println("Youngest friend is: " + names[minAgeIndex] +
                " with age " + ages[minAgeIndex]);
    }

    // Method to find the tallest friend
    public static void findTallest(double[] heights, String[] names) {
        int maxHeightIndex = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }

        System.out.println("Tallest friend is: " + names[maxHeightIndex] +
                " with height " + heights[maxHeightIndex] + " cm");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Friend names
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking input
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }

        // Finding youngest and tallest
        findYoungest(ages, names);
        findTallest(heights, names);

        sc.close(); // Closing Scanner object
    }
}
