package Loop;
import java.util.Scanner;
public class Practice1{
    public static void main(String[] args) {

        //Display Multiplication Table

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for a multiplication table");
        int n =sc.nextInt();

        for (int i = 1; i<=10; i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
        
    }
}
