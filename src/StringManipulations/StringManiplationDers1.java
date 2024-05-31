package StringManipulations;

import java.util.Locale;

public class StringManiplationDers1 {

    public static void main(String[] args) {

        String  str = "Java Candir";
        // buyuk harfe yazdıralım
        System.out.println(str.toUpperCase(Locale.forLanguageTag("EN")));
        System.out.println(str.toLowerCase(Locale.forLanguageTag("EN")));
        str = "JAVA CANDIR";
        System.out.println(str.toUpperCase(Locale.forLanguageTag("EN")));

        System.out.println(str.toLowerCase(Locale.ENGLISH));
        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR")));

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));

        for (int i = 0; i <str.length() ; i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println(" ");
        System.out.println(str.charAt(10));
        System.out.println(str.charAt(11-3));

        // string'de olmayan bir ındex kullanılırsa
        // System.out.println(str.charAt(22));

        String sayi = "30";
        String sayi2 = "22";
        // String sayi3 = 33; çalışma anı hatası  Compile Time Error !
        // String sayi4 = "44a"; çalıştıktan sonra hata Run Time Error !
        System.out.println( Integer.parseInt(sayi) * 2);
        System.out.println(Integer.parseInt(sayi2) *3);
    }
}
