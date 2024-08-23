public class practice {
    public static void main(String args[]){

        String str = "  Mr. JawaniJanemnn Jiii";

        int len = str.length();
        System.out.println(len);

        String str1= str.toUpperCase();
        System.out.println(str1);

        String str2= str.toLowerCase();
        System.out.println(str2);

        String str3= str.trim();
        System.out.println(str3);

        String str4= str.substring(6);
        System.out.println(str4);

        String str5= str.substring(4,11);
        System.out.println(str5);

        String str6= str.replace('a','t');
        System.out.println(str6);

        boolean str7= str.startsWith("Mr.");
        System.out.println(str7);

        boolean str8= str.endsWith("Jiii");
        System.out.println(str8);

        char str9= str.charAt(13);
        System.out.println(str9);

        int str10= str.indexOf("i",10);
        System.out.println(str10);

        int str11= str.lastIndexOf("a",13);
        System.out.println(str11);

    }
}