import java.util.Scanner;
public class circlecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of circle:");
        double radius= sc.nextDouble();
        double circumfrance =2*Math.PI*radius;
        double area =Math.PI*radius*radius;
        System.out.println("The circumference of the circle is: " +circumfrance);
        System.out.println("The Area of the circle is: " +area);

    }
}
55
