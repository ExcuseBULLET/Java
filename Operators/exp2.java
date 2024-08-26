import java.util.Scanner;
public class exp2 {
    public static void main(String args[]){
        float a,b,c,s;
        double area;
        System.out.println("Enter the all three sides of triangle ");
        Scanner x=new Scanner(System.in);
        a= x.nextFloat();
        b= x.nextFloat();
        c= x.nextFloat();
        s=(a+b+c)/2f;
        area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of the triangle is "+area);
        


    }
    
}
