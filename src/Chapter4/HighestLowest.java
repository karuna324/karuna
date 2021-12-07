package Chapter4;
import java.util.Scanner;
public class HighestLowest {
    public static void main(String[] args) {
        System.out.println("enter first number");
        Scanner sc= new Scanner(System.in);
        int first = sc.nextInt();
        System.out.println("enter second number");
        int second = sc.nextInt();
        System.out.println("enter third number");
        int third = sc.nextInt();
        int highest = findHighest(first,second,third);
        System.out.println("highest:"+highest);
        int lowest = find_lowest(first,second,third);
        System.out.println("lowest:"+lowest);
    }
    private static int findHighest(int first,int second,int third) {
        int highest;

        if (first > second && first > third) {
            highest = first;
        }

            else if (second > first && second > third)

    {
        highest = second;
    } else {
            highest = third;
        }
            return highest;


        }




    private static int find_lowest(int first,int second,int third){

        int lowest;

        if (first<  second && first< third) {
        lowest = first;
        }

        else if(second<first && second<third){
            lowest=second;
        }

        else{
        lowest = third;
        }
        return lowest;
        }
    }
