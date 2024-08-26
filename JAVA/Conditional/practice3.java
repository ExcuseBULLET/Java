package Conditional;
import java.util.Scanner;
public class prctice3 {
    public static void main(String args[]){

        //Find grade for given marks

        int m1,m2,m3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of all 3 subjects :");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        float avg=(float)(m1+m2+m3)/3;

        if(avg>=70){
            System.out.println("A Grade");
        }
        else if(avg>=60 && avg<70){
            System.out.println("B Grade");
        }
        else if(avg>=50 && avg<60){
            System.out.println("C Grade");
        }
        else if(avg>=40 && avg<50){
            System.out.println("D Grade");
        }
        else{
            System.out.println("Your are Fail");
        }
    }
}
