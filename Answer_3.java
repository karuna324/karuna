package Homework;

import java.util.Scanner;

public class Answer_3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of names");
        int n= sc.nextInt();
        String[]names=new String[n];
        System.out.println("enter the names: ");
        for(int i=0;i<n;i++){
            names[i]=sc.nextLine();
        }
        String temp;
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(names[i].compareTo(names[j])>0){
                   temp=names[i];
                  names[i]=names[j];
                  names[j]=temp;
                }
            }
        }
        System.out.println("the names in aplphabetical order are");
        for(int i=0;i<n-1;i++){
            System.out.println(names[i]);
        }
        System.out.println(names[n-1]);
sc.close();
        }
}
