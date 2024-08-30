package Loop;
import java.util.*;
public class practice5 {
    public static void main(String[] args) {
        
        //Count digits of number

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to count");
        int n=sc.nextInt();

        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
