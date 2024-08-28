package Conditional;
import java.util.Scanner; 
public class practice6 {
    public static void main(String args[]){

        //Find type of website and the protocal used

        String URL;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a URL");
        URL=sc.nextLine();

        String protocal=URL.substring(0,URL.indexOf(":"));
        if(protocal.matches("http")){
            System.out.println("It's Hypertext Transfer Protocal");
        }
        else if(protocal.matches("ftp")){
            System.out.println("It's File Transfer Protocal");
        }
        else if(protocal.matches("https")){
            System.out.println(" It's Secure Hypertext Transfer Protocal");
        }


        String ext=URL.substring(URL.lastIndexOf(".")+1);
        if(ext.matches("com")){
            System.out.println("and It's a Commercial Website");
        }
        else if(ext.matches("gov")){
            System.out.println("and It's a Government Website");
        }
        else if(ext.matches("org")){
            System.out.println("and It's a Orgnaization Website");
        }
        else if(ext.matches("net")){
            System.out.println("and It's a Network Website");
        }
        else{
            System.out.println("Invalide Website Extension");
        }
    }
}
