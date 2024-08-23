import java.util.Scanner;
class expression {
    public static void main(String agrs[]){
        float area,base,height;
        System.out.println("Enter Base and Height of triangle ");
        Scanner s=new Scanner(System.in);
        base= s.nextFloat();
        height= s.nextFloat();
        area= base*height*0.5f;
        System.out.println("Area of the triangle is "+area);

    }
    
}
