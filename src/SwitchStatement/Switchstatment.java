package SwitchStatement;
import java.util.Scanner;
public class Switchstatment {
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
        // Not ortalaması
        // Dersler ;
        // Matematik
        // Fizik
        // Kimya
        // Türkçe
        // Tarih
        // Müzik

        // 1. adım degişkenleri oluşturalım

        int matematik,fizik,kimya,turkce,tarih,muzik;

        // kullanıcıdan degerleri alalım
        System.out.println("Matematik notunuz: ");
        matematik = scanner.nextInt();
        System.out.println("Fizik  notunuz: ");
        fizik = scanner.nextInt();
        System.out.println("Kimya  notunuz: ");
        kimya = scanner.nextInt();
        System.out.println("Türkçe  notunuz: ");
        turkce = scanner.nextInt();
        System.out.println("Tarih  notunuz: ");
        tarih = scanner.nextInt();
        System.out.println("Müzik  notunuz: ");
        muzik = scanner.nextInt();

        double notOrtalamasıSonucu = (matematik+fizik+kimya+turkce+tarih+muzik) / 6.0;
        System.out.println("Not Ortalaması: " + notOrtalamasıSonucu);

    }
}
