package Array;
import java.util.*;
public class practice2 {
    public static void main(String args[]){

        //Searching a Element in array

        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the element to search in array : ");
        int key=sc.nextInt();
        int A[]= {3,9,7,8,12,6,15,5,4,10};

        for(int i=0; i<A.length;i++){
            if(A[i]==key){
                System.out.println("Element found at: "+i);
                System.exit(0);
            }
        }
        
        System.out.println("Not Found");
        
    }
}
