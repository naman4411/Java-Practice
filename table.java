import java.util.Scanner;
public class table {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int number =sc.nextInt();
        System.out.println((number*1));
     for (int i = 1; i < 11; i++) {
         
         System.out.println(number*i);
     }
    }
}
