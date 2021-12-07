import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Starting point: ");
        int i = sc.nextInt();
        System.out.println("Ending point: ");
        int a = sc.nextInt();
        int count=0;
        for(int c=i; i<=a; i=i+1){
            if(c%2==0)
                count++;
        }
        System.out.println(count);
    }
}
