package JAVA.Conditional;
import java.util.Scanner;
public class practice4 {
    public static void main(String args[]){

        //Find a given year is a leap year

        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year");
        year=sc.nextInt();

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("It is Leap Year");
                }
                else{
                    System.out.println("It's Not a Leap Year");
                }
            }
            else{
                System.out.println("It's Not a Leap Year");
            }
        }
        else{
            System.out.println("It is Leap Year");
        }
     }
}
