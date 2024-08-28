package Conditional;
import java.util.Scanner;
public class practice1{
    public static void main(String agrs[]){
        //Find the number is odd or even
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        n=sc.nextInt();

        if(n%2==0){
            System.out.println("The Number is Even");
        }
        else{
            System.out.println("The Number is Odd");
        }
    }
}
