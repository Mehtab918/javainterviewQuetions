import java.util.Scanner;
public class AddingTwoNumber
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        
        System.out.println("Enter first number :"+ num1);
        
        int num2 = sc.nextInt();
        
        System.out.println("Enter first number :"+ num2);
        
        int add = num1 + num2 ;
        
         System.out.println("After adding two numbers :"+ add);
         
    }
}