package Loop;
import java.util.*;
public class practice2 {
    public static void main(String args[]){

        //Find sum of n natural numbers

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number of terms ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
            sum=sum+i;
        }
        System.out.println("Sum of "+n+" natural no. is " +sum);
    }

}
