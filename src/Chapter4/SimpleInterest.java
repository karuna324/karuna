package Chapter4;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter principle");
        int principle = sc.nextInt();
        System.out.println("enter rate");
        int rate = sc.nextInt();
        System.out.println("enter time");
        int time = sc.nextInt();
        float result = karuna(principle,rate,time);
        System.out.println("simple interest="+result);

    }
    public static int karuna (int principle,int rate,int time){
        int result;
        result = principle*rate*time/100;
        return result;
    }
}
