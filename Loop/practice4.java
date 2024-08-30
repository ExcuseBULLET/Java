package Loop;
import java.util.*;
public class practice4 {
    public static void main(String args[]){

        //Display Digits of a number

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        int r;
        while(n>0){
            r=n%10;
            n=n/10;
            System.out.println(r);
        }
    }
}
