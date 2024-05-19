package IfStatement;

import java.util.Scanner;

public class ElseBlogununGorevi {
    public static void main(String[] args) {

        // Kullanıcıdan bir sayı alın
        // sayı tek basamaklı ise RAKAM
        // iki basamaklı ise KUCUK SAYI
        // üç basamaklı ise BUYUK SAYI yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi>=0 && sayi<=9){
            System.out.println("RAKAM");
        } else if (sayi>=10 && sayi<=99) {
            System.out.println("KUCUK SAYI");

        } else if (sayi>=100 && sayi<=999) {
            System.out.println("BUYUK SAYI");

        }

    }
}
