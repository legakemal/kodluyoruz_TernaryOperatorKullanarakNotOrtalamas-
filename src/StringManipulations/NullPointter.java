package StringManipulations;

public class NullPointter {

    public static void main(String[] args) {

        String str1;
        // System.out.println(str1); // Variable 'str1' might not have been initialized
        String str2="";
        System.out.println(str2);

        str1 = null;
        System.out.println(str1);
        String str3 = "  Java Candir  ";
        System.out.println(str3.repeat(2));
        System.out.println(str3.trim());
    }
}
