public class ques {
    public static void main(String agrs[]){

        // Find if a number is binary or not

        int a= 101111010;
        String str= String.valueOf(a);
        System.out.println(str.matches("[01]+"));


        //Find if a number is hexadecimal or not

        String str2= "238BA589";
        System.out.println(str2.matches("[0-9A-F]+"));

        //Find the date in date format

        String str3= "01/03/2009";
        System.out.println(str3.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));

        //Remove special character from a string

        String str4= "a!b@c#1$2%3&4";
        System.out.println(str4.replaceAll("[^a-zA-Z0-9]",""));

        //Remove extra space from the string

        String str5= "   abc   def    ghi    jkl     ";
        System.out.println(str5.replaceAll("\\s","").trim());

        //Find number of words in string

        String str6= "Bhootni...";
        System.out.println(str6.length());

    }
}
