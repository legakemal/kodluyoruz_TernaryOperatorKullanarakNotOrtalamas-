package StringManipulations;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {

        // Kullanıcıdan bir şifre isteyin aşağıdaki şartları kontrol edin
        // kullanıcıya duzeltmesi gereken tum eksikleri soyleyin
        // Eğer tum şartları sağlıyorsa "şifre başarıyla kaydedildi" yazdırın

        // ilk harf kucuk harf olmalı
        // son karakter rakam olmalı
        // şifre boşluk içermemeli
        // uzunluğu en az 10 karakter olmalı

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir şifre giriniz: ");
        String sifre = scanner.nextLine();

        // if else if ifadelerinde sadece bir if body'si çalışır
        // tum hataları yazdırabilmek için bağımsız if cumleleri kullanılır



        char ilkharf = sifre.charAt(0); // ilk harf kucuk olmalı
        if (!Character.isLowerCase(ilkharf))
            System.out.println("ilk harf kucuk olmalı");

        char  sonkarktter = sifre.charAt(sifre.length()-1);
        if (sonkarktter < '0' || sonkarktter > '9')    // son karakter rakam olmalı
            System.out.println("son karakter rakam olmalı");

        if (!sifre.contains(" ")) // şifre boşluk içermemeli
            System.out.println("şifre boşluk içermemeli");


    }
}
