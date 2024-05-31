package StringManipulations;

import java.util.Scanner;

public class IndexOfLastIndexOfSoru {
    public static void main(String[] args) {

        // Kullanıcıdan bir String ve aranacak metin alın
        // Aranacak metnin String içerisinde kullanımını kontrol ederek,
        // asağıdaki cumlelerden uygun olanını yazdırın.

        // - String aranan metni içermiyor
        // - Aranan metin String'de  1 kere kullanılmış
        // - Aranan metin String'de  1'den fazla kullanılmış.

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Bir cümle giriniz: ");
        String cumle = scanner.nextLine();
        System.out.println("Kelimeyi giriniz :");
        String kelime = scanner.nextLine();

        // Deniz Ulusoy Java Dersi

        int kelime_IndexOf = cumle.indexOf(kelime);
        int kelime_lastOf = cumle.lastIndexOf(kelime);

        if (kelime_IndexOf == -1){
            System.out.println("Kelime cumle içerisinde geçmiyor");
        } else if (kelime_IndexOf == kelime_lastOf) {
            System.out.println("Kelime cumlede 1 kere kullanılmış");
        } else {
            System.out.println("Kelime cumlede 1'den fazla kullanılmış");
        }
    }
}
