package StringManipulations;

public class IndexOf_lastIndexOfDersi {
    public static void main(String[] args) {

        String metin = "Ali topu at.";

        // Cümlede top geçiyorsa index ini yazdırın
        System.out.println(metin.lastIndexOf("Tava")); // olmadığı için -1 dondurdu.
        System.out.println(metin.indexOf("at",9)); // at kelimesini ara ama (fromIndex 9) 9. index'ten itibaren ara.
        System.out.println(metin.lastIndexOf('a',9));
    }
}
