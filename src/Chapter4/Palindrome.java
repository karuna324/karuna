package Chapter4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("enter number :");
        num = sc.nextInt();
        int reverse= Answer(num);
        if(!(reverse==num)){
            System.out.println("It is not palindrome");
        }else{
            System.out.println("It is palindrome");
        }




    }

    private static int Answer(int num) {
        int reverse = 0;


        while (num > 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;

            }
        return reverse;

        }
    }








