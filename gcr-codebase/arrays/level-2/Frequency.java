import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int temp = num;   // store original number
        int count = 0;

        // Count digits
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        int arr[] = new int[count];
        temp = num;   // reset temp
        int index = 0;

        // Store digits in array
        while (temp > 0) {
            arr[index] = temp % 10;
            temp = temp / 10;
            index++;
        }

        int frequency[] = new int[10];

        // Calculate frequency
        for (int i = 0; i < count; i++) {
            frequency[arr[i]]++;
        }

        // Print frequency
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Frequency of " + i + " is " + frequency[i]);
            }
        }

        sc.close();
    }
}
