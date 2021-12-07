
import java.util.Scanner;
public class MenuDrivenProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu Driven Program");
        System.out.println("-------------------");
        System.out.println("1. Add two nos.");
        System.out.println("2. Palindrome number");
        System.out.println("3. Simple Interest");
        System.out.println("4.Odd even");
        System.out.println("Enter your choice(1,2,3,4,): ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter first no : ");
                int first= sc.nextInt();
                System.out.println("Enter Second no : ");
                int second = sc.nextInt();
                int result = first+second;
                System.out.println("Sum is "+ result);
                break;

            case 2:
                System.out.println("Enter the number :");
                int num=sc.nextInt();
                int rem= num%10;
                int qout= num/10;
                int res = rem*10+qout;
                if(num==res)
                {
                    System.out.println("Palindrome");
                } else{
                    System.out.println("Not Palindrome");
                }
                break;

            case 3:
                float p,t,r;
                float si;
                System.out.println("Principle :");
                p=sc.nextFloat();
                System.out.println("Time :");
                t = sc.nextFloat();
                System.out.println("Rate :");
                r = sc.nextFloat();
                si = (p*t*r)/100;
                System.out.println("Simple Interest :"+si);
                 break;

                 case 4:
                     System.out.println("Enter Number : ");
                     int number=sc.nextInt();
                     if(number%2==0)
                     {
                         System.out.println("Even");
                     } else{
                         System.out.println("Odd");
                     }

            default:

                System.out.println("Invalid");
                break;
        }
    }
}
