import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Multiplication table of:");
        int table= sc.nextInt();
        for(int i=1; i<11; i++){
            System.out.println(table+"*"+i+"="+(i*table));
        }

    }

}
