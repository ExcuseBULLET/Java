public class email_id {
    public static void main(String args[]){
        
        String str = "programmer@gmail.com";

        //Find username and domain name from email
        
        int i= str.indexOf('@');

        String Uname= str.substring(0,i);
        String domain= str.substring(i+1,str.length());
        
        System.out.println("Username : "+Uname);
        System.out.println("Domain : "+domain);

        //find if the email id is an gmail
        
        int j= domain.indexOf(".");
        String name= domain.substring(0,j);
        System.out.println(name.equals("gmail"));

    }
}
