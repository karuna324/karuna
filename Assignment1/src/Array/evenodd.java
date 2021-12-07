package Array;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        int[] arr;
        arr = new int[5];
        int size;
        System.out.println("Enter the size of array:");

        size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element for index" + i + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println("array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
            if (arr[i] % 2 == 0) {
                even += 1;
            } else {
                odd += 1;

            }
        }
        System.out.println("the number of even is " + even + "");
        System.out.println("the number of odd is " + odd + "");


    }
}
