import java.util.Scanner;
public class Ques7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSum(n);
    }   
    public static void printSum(int n) {
        int sum = 0;

       for(int i=1; i<=n; i++) {
         if(i % 2 != 0) {
             sum = sum + i;
         }
       }
       System.out.println(sum);
    }
     }
     