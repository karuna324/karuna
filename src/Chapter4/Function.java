package Chapter4;
import java.util.Scanner;
public class Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        int first = sc.nextInt();
        System.out.println("enter second number:");
        int second = sc.nextInt();
        int result = addTwoNumber(first,second);
        System.out.println("Sum is"+ result);
    }

    public static int addTwoNumber(int first,int second){

        return first + second;

    }
}
