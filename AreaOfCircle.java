import java.util.Scanner;
public class AreaOfCircle {
public static void main (String[] args){
    Scanner sc= new Scanner (System.in);
    System.out.print("enter the Radius:");
    double radius=sc.nextInt();
    double area=AreaofCircle(radius,area);
    System.out.print("AreaofCircle is"+ area);

}
    public static double AreaofCircle(radius,area){
        area=2*Math.PI*radius;
    }
}
