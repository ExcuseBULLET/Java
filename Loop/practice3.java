package Loop;
import java.util.*;
public class practice3 {
    public static void main(String[] args) {

        //Factorial of a number
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for factorial");
        int n=sc.nextInt();
        long fact=1;

        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+"! is "+fact+".");

    }
}
