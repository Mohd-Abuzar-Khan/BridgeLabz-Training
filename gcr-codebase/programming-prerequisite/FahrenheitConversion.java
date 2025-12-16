import java.util.*;
public class FahrenheitConversion {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int far = (x * 9 / 5) + 32;
        System.out.println(far);

    }
}