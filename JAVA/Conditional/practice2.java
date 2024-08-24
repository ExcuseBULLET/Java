package Conditional;
import java.util.Scanner;
public class practice2 {
    public static void main(String args[]){
        
        //Find Person is Young or not Young

        int Age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of the person : ");
        Age= sc.nextInt();

        if(Age>=14 && Age<=54){
            System.out.println("The person is Young");
        }
        else{
            System.out.println("Ooops...!! The person is Not Young");
        }
    }
}
