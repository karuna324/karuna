package Array;
import java.util.Scanner;
public class average {
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
        int sum =0;
        for (int i=0;i<size;i++)
        sum+=arr[i];
        System.out.println("average= "+(sum/size));

    }
}
