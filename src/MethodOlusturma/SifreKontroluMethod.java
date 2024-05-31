package MethodOlusturma;

import java.util.Scanner;

public class SifreKontroluMethod {
    public static void main(String[] args) {

        // Soru: Kullaıcıdan bir şifre isteyin aşağıdaki şartları kontrol edin ve geçerli şifre girilene kadar
        //  tekrar şifre isteyin
        //  şifre kolntrolunu bir metod da yapıp
        //  şifre geçerli ise true, şifre geçersiz ise false dondurun
        //  şifre geçerli olunca "şifre basarıyula kaydedildi" yazdırın ve islemi bitirin

        //  Method'da  yapılacaklar
        //  - kullanıcıya duzeltmesi gereken tum eksiklikleri soyleyin
        //  - eğer tum şartları sağlarsa true, hata varsa false dondurun
        //  - ilk harf kucuk olmalı
        //  - son karakter rakam olmalı
        //  - şifre boşluk içermemeli
        //  - uzunluğu en az 10 karakter olmalı


        Scanner scanner = new Scanner(System.in);


        for (int i = 1; i <1000 ; i++) {
            System.out.println("Lütfen bir şifre giriniz: ");
            String sifre = scanner.nextLine();
            boolean kontrolSonucu = sifreKontrolMethod(sifre);

            if (kontrolSonucu ==true){
                System.out.println("Şifreniz başarıyla kaydedildi");
                break;
            }
           else{
                System.out.println("şifre hatalı tekrar deneyiniz!..");
            }
        }


    }

    public static boolean sifreKontrolMethod(String sifre){
        boolean sifreTrueMu =true; // bizim flag'ımız hata bulununca false olacak

        char ilkHarf = sifre.charAt(0);

        if (!Character.isLowerCase(ilkHarf)){
            System.out.println("Ilk harf kucuk harf olmalı");
            sifreTrueMu = false;
        }

        char sonKarakter = sifre.charAt(sifre.length()-1);
        if (sonKarakter <'0' || sonKarakter > '9'){
            System.out.println("son karakter rakam olmalı");
            sifreTrueMu =false;
        }

        if (sifre.contains(" ")){
            System.out.println("şifre boşluk içermemeli");
            sifreTrueMu = false;
        }

        if (sifre.length() < 10){
            System.out.println("şifre uzunluğu en az 10 karekter olmalı");
            sifreTrueMu =false;
        }
        return sifreTrueMu;
    }
}
