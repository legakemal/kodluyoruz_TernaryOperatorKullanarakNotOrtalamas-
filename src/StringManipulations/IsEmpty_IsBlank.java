package StringManipulations;

public class IsEmpty_IsBlank {

    public static void main(String[] args) {

        String str1 = "";
        String str2 = " ";
        String str3 = "   ";
        String str4 = "Ali Can";

        System.out.println(str1.isEmpty()); // true boşMu?
        System.out.println(str2.isEmpty()); // false boş degil
        System.out.println(str3.isEmpty()); // false boş degil
        System.out.println(str4.isEmpty()); // false boş degil

        System.out.println(str1.isBlank());
        System.out.println(str2.isBlank());
        System.out.println(str3.isBlank());
        System.out.println(str4.isBlank());
    }
}
