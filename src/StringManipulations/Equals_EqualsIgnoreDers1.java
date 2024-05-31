package StringManipulations;

public class Equals_EqualsIgnoreDers1 {

    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "ali";
        String str3 = "ALI";
        String str4 = "ALi";
        String str5 = "ALI ";
        String str6 = "ALi ";

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));
        System.out.println(str3.equals(str5));

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str2.equalsIgnoreCase(str3));
        System.out.println(str3.equalsIgnoreCase(str4));
        System.out.println(str4.equalsIgnoreCase(str5));
        System.out.println(str5.equalsIgnoreCase(str6));


        String s1 = "Ali";
        String s2 = "Ali";
        String s3 = new String("Ali");
        String s4 = "A" + "li";
        String s5 = "A";
        String s6 = "li";
        String s7 = s5+s6;

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s7);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s7));



    }
}
