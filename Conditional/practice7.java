package Conditional;
import java.util.Scanner;
public class practice7 {
    public static void main(String args[]){

        //Make a menu driven program fot Arithmatic operation

        Scanner sc=new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("======");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter two Number");
        int x=sc.nextInt();
        int y=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter an option number from menu");
        int option=sc.nextInt();
        switch(option){
            case 1: System.out.println("Sum is "+(x+y));
            break;
            case 2: System.out.println("Difference is "+(x-y));
            break;
            case 3: System.out.println("Multiplication is "+ (x*y));
            break;
            case 4: System.out.println("Division is "+ (x/y));
            break;
            default: System.out.println("Invalid Option");
            break;
        }
    }
}

