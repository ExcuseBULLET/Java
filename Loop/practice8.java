package Loop;
import java.util.*;
public class practice8 {
    public static void main(String[] args) {
        
        //Check a number is Palindrome

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int m=n;
        int rev=0,r;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        System.out.println(rev);

        if(m==rev){
            System.out.println("The Number is Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
