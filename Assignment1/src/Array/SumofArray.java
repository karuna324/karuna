package Array;
import java.util.Scanner;
public class SumofArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr;
        arr=new int[5];
        System.out.println("Enter the size of array:");
        int size;
        size= sc.nextInt();
        for (int i=0;i<size;i++){
            System.out.println("Enter the element for index" +i+":");
            arr[i]= sc.nextInt();
        }
        System.out.println("array elements are:");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
}
