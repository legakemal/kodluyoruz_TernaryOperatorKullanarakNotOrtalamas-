package MethodOlusturma;

import java.util.Scanner;

public class SifreKontrolu {
    public static void main(String[] args) {

        // Kullanıcıdan şifre isteyin
        // Şifre class'ından method ile girilen sifreyi kontrol edip
        // şifre sarları sağlayıncaya kadar yeniden şifre isteyin.

        Scanner scanner = new Scanner(System.in);

        boolean sifreIsteDevamEt = true;

        while (sifreIsteDevamEt){
            System.out.println("Şifre giriniz: ");
            String sifre = scanner.nextLine();

            boolean sifreKontrolSonucu = SifreKontroluMethod.sifreKontrolMethod(sifre);

           sifreIsteDevamEt = false;
            System.out.println("şifre kaydedildi");

        }
    }
}
