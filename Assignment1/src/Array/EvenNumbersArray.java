package Array;
import java.util.Scanner;
public class EvenNumbersArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr; int size;
        arr = new int[7];
        System.out.println("Enter the size of array: ");
        size=sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
            if (arr[i] % 2 == 0) {

                System.out.println("evens ="+arr[i]);

            }
        }



    }
}



