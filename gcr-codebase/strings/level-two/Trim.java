import java.util.Scanner;

public class TrimString {

    // Created a method to find starting and ending position
    public static int[] index(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

   // Created a method for generating substring
    public static String substring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result = result + str.charAt(i);
        }
        return result;
    }

    // Created a method to compare two string
    public static boolean compare(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input and calling methods
        System.out.println("Enter a string with leading and trailing spaces:");
        String str = sc.nextLine();
        int[] indexes = index(str);
        String firstTrim = substring(str, indexes[0], indexes[1]);

        String secondTrim = str.trim();
        boolean isSame = compare(firstTrim, secondTrim);

        // Display results
        System.out.println("\nCustom Trimmed String  : [" + firstTrim + "]");
        System.out.println("Built-in Trimmed String: [" + secondTrim + "]");
        System.out.println("Are both strings equal?: " + isSame);

        sc.close();
    }
}
