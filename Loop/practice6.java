package Loop;
import java.util.*;
public class practice6 {
    public static void main(String[] args) {
        
        //Find a number is Armstrong or Not

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int m=n;
        long sum=0,r;
        while(n>0){
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        System.out.println(sum);

        if(m==sum){
            System.out.println("It is Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }
    }
}
