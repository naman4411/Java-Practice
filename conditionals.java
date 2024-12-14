import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a =sc.nextInt();
        System.out.print("enter b:");
        int b =sc.nextInt();

        System.out.println("Choose Operation");
        System.out.println(" 1 : +(addition)");
        System.out.println(" 2 : -(substraction)");
        System.out.println(" 3 : *(Multiplication)");
        System.out.println(" 4 : /(Division)");
        int choice= sc.nextInt();
        switch(choice){
            case 1:System.out.println(a+b);
            break;
            case 2:System.out.println(a-b);
            break;
            case 3:System.out.println(a*b);
            break;
            case 4:System.out.println(a/b);
            break;
            default:System.out.println("invalid no.");
        }
       
    }
}
