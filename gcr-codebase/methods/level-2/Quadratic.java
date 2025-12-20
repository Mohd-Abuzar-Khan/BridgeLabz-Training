import java.util.Scanner;

public class Quadratic {

    // Method to find roots of quadratic equation
    public static double[] findRoots(double a, double b, double c) {

        // Calculate delta 
        double delta = Math.pow(b, 2) - 4 * a * c;

        // If delta is positive
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        }

        // If delta is zero 
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }

        // If delta is negative
        else {
            return new double[]{}; // empty array
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input values
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        // Finding roots
        double[] roots = findRoots(a, b, c);

        // Displaying result
        if (roots.length == 2) {
            System.out.println("Two real roots found:");
            System.out.println( roots[0]);
            System.out.println( roots[1]);
        } else if (roots.length == 1) {
            System.out.println("One real root found:");
            System.out.println( roots[0]);
        } else {
            System.out.println("No real roots exist.");
        }

        sc.close(); // Closing Scanner object
    }
}
