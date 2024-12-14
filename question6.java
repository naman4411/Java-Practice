import java.util.Scanner;
public class question6{
public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	System.out.print("enter num1 : ");
	int num1= sc.nextInt();
	System.out.print("enter num2 : ");
	int num2= sc.nextInt();
	System.out.print("enter num3 : ");
	int num3= sc.nextInt();

	
	int Average = AverageCal(num1 , num2 , num3 );
	System.out.print( "The Average is"+ Average);
}
public static int AverageCal( int num1 , int num2 , int num3 ){
	return (num1+num2+ num3)/3 ;

}
}
