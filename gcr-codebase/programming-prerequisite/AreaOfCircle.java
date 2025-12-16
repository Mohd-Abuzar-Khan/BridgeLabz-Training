import java.util.*;
public class AreaOfCircle{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int radius = sc.nextInt();
        int height = sc.nextInt();
        double PI = 3.14;
        double area = PI * (radius * radius) * height;
        System.out.println(area);
    }
}