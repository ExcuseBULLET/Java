package Loop;
import java.util.*;
public class practice7 {
    public static void main(String[] args) {
        
        //Reverse a number

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to reverse ");
        int n=sc.nextInt();

        int rev=0,r;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        System.out.println("Reverse is "+rev);
    }
}
