package StringManipulations;

public class SubStringDersi {

    public static void main(String[] args) {

        String str = "Java Dersi Candir";
        // str'ın 3. karakterini yazdırın

        System.out.println(str.charAt(2));

        // str'ın 3. index'ınden başlayarak sonuna kadar olan kısmı yazdırın

        System.out.println(str.substring(3));

        // str2ın 6. ındex'inden başlayarak sonuna kadar olan kısmı yazdırın
        System.out.println(str.substring(6));

        // str'ın sondan 3. karakterini yazdırın

        System.out.println(str.charAt(str.length()-3));

        // str'ın son 5 karakterini yazdırın
        System.out.println(str.substring(str.length()-5));

        // sondan 1 karkteri yazdırın
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.substring(str.length()-1));
        System.out.println(str.substring(3,str.length()-6));

        System.out.println(str.substring(str.length()));

        System.out.println(str.substring(5,11));

        // başlangıç index'i ile bitiş index'i aynı olursa
        System.out.println(str.substring(3,3));

        // Eğer başlangıç index'i ile bitiş index'i arasında bir fark olursa
        System.out.println(str.substring(2,3));

        System.out.println(str.substring(0,2));

        // başlangıç index'i bitiş index'inden buyuk olursa
        // System.out.println(str.substring(5,4));  StringIndexOfBoundException

        String a = "J";
        String b = "a";
        String c = "v";
        String d = "a";
        System.out.println(a.concat(b).concat(c+d));

    }
}
